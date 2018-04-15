import java.util.Vector;

public class Page
{
  public int id;
  public int physical;
  public byte R;
  public byte M;
  public int inMemTime;
  public int lastTouchTime;
  public long high;
  public long low;
  public Vector<Integer> Rbits;

  public Page( int id, int physical, byte R, byte M, int inMemTime, int lastTouchTime, long high, long low ) 
  {
    this.id = id;
    this.physical = physical;
    this.R = R;
    this.M = M;
    this.inMemTime = inMemTime;
    this.lastTouchTime = lastTouchTime;
    this.high = high;
    this.low = low;
    this.Rbits = new Vector<Integer>();
    for(int i = 0; i < 8; i++){
      this.Rbits.add(0);
    }
  }

  public void changeRbits(int val){
    this.Rbits.add(0, val);
    this.Rbits.remove(8);
  }

  public int valueRbits(){
    int res = 0;
    for(int i = 7; i >= 0; i--){
      res += Rbits.get(i) * Math.pow(2, 7-i);
    }
    return res;
  }

}
