# Assignment6

CSC207-01 Quang Duc Nguyen

Problem 1:
/*
   * For the contain() method, I choose to count:
   * 
   * - the number of time we access the arr.
   * 
   * - the number of time we compare the subtraction to eps.
   * 
   * The input of my model is the length of the array.
   * 
   * The worst case scenario would be when there is no element in arr satisfies the Math.abs(arr[i]
   * - d) < eps.
   * 
   * The model of time complexity of this method is: T(n) = 2*n. Tight upper bound of this model is
   * O(n).
   * 
   * Proving that the upper bound holds: c = 3, xo > 0, we always have T(xo) < 3 * O(xo).
   */
   
   double[] arr1 = new double[] {1.0, 4.5, 6.5, -1.0, -2.0, -1.5};
   double[] arr2 = new double[] {-3.0, -2.4, -3.2, -1.0, 0, 1.0, 2.0, 3.6, 5.6, 4.5, 3.6, 1.2};
   double[] arr3 = new double[] {-7.5, -9.4, 6.0, 100.0};
    // run for array 1
    /*
     * The length of the array is: 6
     * 
     * The counter is: 12
     * 
     * The method returns result: false
     */
    boolean result = Problem1.contain(arr1, 0, 5.0);
    pen.println(printResultProb1(arr1.length, Problem1.getCounter(), result));

    // run for array 2
    /*
     * The length of the array is: 12
     * 
     * The counter is: 24
     * 
     * The method returns result: false
     */
    result = Problem1.contain(arr2, 0, 5.0);
    pen.println(printResultProb1(arr2.length, Problem1.getCounter(), result));

    // run for array 3
    /*
     * The length of the array is: 4
     * 
     * The counter is: 8
     * 
     * The method returns result: false
     */
    result = Problem1.contain(arr3, 0, 5.0);
    pen.println(printResultProb1(arr3.length, Problem1.getCounter(), result));
  }
Problem 2:

Problem 3:
Problem 4:
Problem 5:
