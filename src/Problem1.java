
public class Problem1 {
  private static int counter = 0;
  
  public static boolean contain(double[] arr, double eps, double d) {
    //reset the counter
    counter = 0;
    
    for (int i = 0; i < arr.length; i++) {
      counter += 2;
      if (Math.abs(arr[i] - d) < eps) {
        return true;
      }
    }
    return false;
  }
  
  public static int getCounter() {
    return counter;
  }
}
