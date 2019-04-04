// In IntPair.java
public class IntPair {
  private int fst;
  private int snd;

  public IntPair(int fst, int snd) {
    this.fst = fst;
    this.snd = snd;
  } // IntPair(int,int)

  public int getFst() {
    return fst;
  } // getFst()

  public int getSnd() {
    return snd;
  } // getSnd()
  
  public String toString() {
    String str = new String();
    str += "(" + fst +", " + snd + ")";
    return str;
  }
} // IntPair
