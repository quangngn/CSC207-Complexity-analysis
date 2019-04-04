
public class Problem3 {
  private static int counter = 0;
  
  public static IntPair[] allPairs(int[] arr) {
    if(arr == null) {
      throw new IllegalArgumentException();
    }
    
    counter = 0;
    IntPair[] pairArr = new IntPair[arr.length * arr.length]; 
    
    for(int i = 0; i < arr.length; i++) {
      for(int j = 0; j < arr.length; j++) {
        counter += 3;
        pairArr[i * arr.length + j] = new IntPair(arr[i], arr[j]);
      }
    }
    
    return pairArr;
  }
  
  public static int getCounter() {
    return counter;
  }
}
