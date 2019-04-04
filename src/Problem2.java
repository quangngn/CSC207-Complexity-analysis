
public class Problem2 {
  private static int counter = 0;
  
  public static int fastModExp(int x, int y, int mod) throws Exception {
    counter = 0;
    
    if(mod == 0) {
      throw new Exception("mod cannot be 0");
    }
    
    return fastModExpHelper(x, y, mod);
  }
  
  private static int fastModExpHelper(int x, int y, int mod) {
    counter++;
    if(y == 0) {
      if(mod == 1) {
        return 0;
      } else {
        return 1;
      }
    } else if (y % 2 == 0) {
      return fastModExpHelper(x*x, y/2, mod);
    } else {
      return (x * fastModExpHelper(x, y - 1, mod)) % mod;
    }
  }
  
  public static int getCounter() {
    return counter;
  }

}
