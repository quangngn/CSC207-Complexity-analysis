
public class Problem4 {
  private static int counter = 0; 
  
  public static String concatAndReplicateAll(String[] arr, int n) {
    if(arr == null) {
      throw new IllegalArgumentException();
    }
    //reset the counter
    counter = 0;
    
    String returnStr = new String();
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < n; j++) {
        counter++;
        returnStr += arr[i];
      }
    }
    return returnStr;
  }
  
  public static int getCounter() {
    return counter;
  }
}
