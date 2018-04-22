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
  public int RbitsVectorSize;

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
  }

  public void changeRbits(int val){
    this.Rbits.add(0, val);
    this.Rbits.remove(this.RbitsVectorSize);
  }

  public int valueRbits(){
    String bits = "";
    for (int i = 0; i < this.RbitsVectorSize; i++){
      bits += String.valueOf(this.Rbits.get(i));
    }
    return Integer.parseInt(bits, 2);
  }

}
