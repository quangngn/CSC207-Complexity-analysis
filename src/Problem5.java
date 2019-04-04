
public class Problem5 {
  private static int counter = 0;

  public static int[] interLeave(int[] arr1, int[] arr2) {
    counter = 0;

    int totalLength = arr1.length + arr2.length;

    // count how many element of each input array has been added to the returned array.
    int arr1Counter = 0;
    int arr2Counter = 0;

    int[] returnArr = new int[totalLength];

    while (arr1Counter < arr1.length && arr2Counter < arr2.length) {
      if ((arr1Counter + arr2Counter) % 2 == 0) {
        returnArr[arr1Counter + arr2Counter] = arr1[arr1Counter++];
        counter += 2;
      } else {
        returnArr[arr1Counter + arr2Counter] = arr2[arr2Counter++];
        counter += 2;
      }
    }
    
    while(arr1Counter < arr1.length) {
      returnArr[arr1Counter + arr2Counter] = arr1[arr1Counter++];
      counter += 2;
    }
    
    while(arr2Counter < arr2.length) {
      returnArr[arr1Counter + arr2Counter] = arr2[arr2Counter++];
      counter += 2;
    }

    return returnArr;
  }
  
  public static int getCounter() {
    return counter;
  }
}
