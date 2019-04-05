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
   * The worst case scenario would be when there is no element in arr satisfies Math.abs(arr[i] - d) < eps.
   * 
   * The model of time complexity of this method is: T(n) = 2*n. Tight upper bound of this model is
   * O(n).
   * 
   * Proving that the upper bound holds: c = 3, xo > 0, we always have T(xo) < 3 * O(xo).
   */
   
   private static void analyseProblem1() {
   
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
/*
   * !!! Assume that we have y is a power of 2. For the fastModExp(), I choose to count:
   * 
   * - the number of time the method recursively call itself. Because y is a power of 2, y is almost
   * always even (except when y = 2^0 = 1)
   * 
   * The input of the model: y.
   * 
   * Solve the recurrence relation using substitution method:
   * 
   * at anytime:
   * 
   * + T(y) = 1 + T(y/2);
   * 
   * + T(y/2) = 1 + T(y/4);
   * 
   * ... and we repeat that for approximately log 2 of y times until we reach T(1).
   * 
   * we have f(1) = 1;
   * 
   * -> we have T(y) = 1 + (log 2 of y). So we have the tight upper bound: O(log(n));
   * 
   * Proving that the upper bound holds. We have: c = 10, xo > 2, we always have T(xo) < 10 *
   * log(xo).
   * 
   * @exception for mod == 0
   */
   
  private static void analyseProblem2() throws Exception {
  
    // 1st try
    /*
     * We calculate: 2^8 mod 8
     * 
     * The counter is: 5
     * 
     * The result is: 0
     */
    int result = Problem2.fastModExp(2, 8, 8);
    pen.println(printResultProb2(2, 8, 8, Problem2.getCounter(), result));

    // 2nd try
    /*
     * We calculate: 11^4 mod 13
     * 
     * The counter is: 4
     * 
     * The result is: 3
     */
    result = Problem2.fastModExp(11, 4, 13);
    pen.println(printResultProb2(11, 4, 13, Problem2.getCounter(), result));

    // 3rd try
    /*
     * We calculate: 13^0 mod 23
     * 
     * The counter is: 1
     * 
     * The result is: 1
     */
    result = Problem2.fastModExp(13, 0, 23);
    pen.println(printResultProb2(13, 0, 23, Problem2.getCounter(), result));
  }

Problem 3:
/*
   * For allPairs() method, I choose to count:
   * 
   * - the number of time accessing the input array.
   * 
   * - the number of time accessing the output array.
   * 
   * The input of my model is the length of the input array. Let's call it n.
   * 
   * I have the model T of time complexity of my method is: T(n) = (3 * n)^2. The upper bound is:
   * O(n^2);
   * 
   * Proving that the bound holds: for c = 10, xo > 0, We always have T(xo) < 10 * O(xo^2);
   */
   
  private static void analyseProblem3() {
  
    int[] arr1 = new int[] {5, 6, 7, 3, 2};
    int[] arr2 = new int[] {2, 3, -1};
    int[] arr3 = new int[] {4};

    // First try
    /*
     * The input array is: 5 6 7 3 2
     * 
     * The output result is: (5, 5) (5, 6) (5, 7) (5, 3) (5, 2) (6, 5) (6, 6) (6, 7) (6, 3) (6, 2)
     * (7, 5) (7, 6) (7, 7) (7, 3) (7, 2) (3, 5) (3, 6) (3, 7) (3, 3) (3, 2) (2, 5) (2, 6) (2, 7)
     * (2, 3) (2, 2)
     * 
     * The counter is: 75
     */
    IntPair[] result = Problem3.allPairs(arr1);
    pen.println(printResultProb3(arr1, result, Problem3.getCounter()));

    // Second try
    /*
     * The input array is: 2 3 -1
     * 
     * The output result is: (2, 2) (2, 3) (2, -1) (3, 2) (3, 3) (3, -1) (-1, 2) (-1, 3) (-1, -1)
     * 
     * The counter is: 27
     */
    result = Problem3.allPairs(arr2);
    pen.println(printResultProb3(arr2, result, Problem3.getCounter()));

    // Third try
    /*
     * The input array is: 4
     * 
     * The output result is: (4, 4)
     * 
     * The counter is: 3
     */
    result = Problem3.allPairs(arr3);
    pen.println(printResultProb3(arr3, result, Problem3.getCounter()));
  }
  
Problem 4:
/*
   * For this problem, I choose to count:
   * 
   * - the number of time we need to concatenate String.
   * 
   * The number of concatenation depends on the repeating number "n" and the length of the input
   * String array (let's call that m).
   * 
   * T(n, m) = n*m; We have the upper bound of the complexity is O(n*m);
   * 
   * In case Java does O(x+y) concatenation of 2 Strings with length x and y, we will be in a very
   * strange situation. The number of time we call concatenation would still be m*n, but time
   * complexity of concatenation would be O(x + y).
   * 
   * For example, think about an input String array = ["abc", "de", "fghi"]; repetition = 3. We
   * count the times each character got add to an array.
   * 
   * 1st concatenation "" + "abc": counter = 3, current String = "abc"
   * 
   * 2nd concatenation "abc" + "abc": counter = 3 + 3 = 6, current String = "abcabc".
   * 
   * 3rd concatenation "abcabc" + "abc": counter = 6 + 3 = 9, current String = "abcabcabc";
   * 
   * 4th concatenation "abcabcabc" + "de": counter = 9 + 2 = 11, current String = "abcabcabcde";
   * 
   * 5th concatenation "abcabcabcde" + "de": counter = 11 + 2 = 13, current String =
   * "abcabcabcdede";
   * 
   * 6th concatenation ...
   * 
   * until current String = "abcabcabcdededefghifghifghi".
   * 
   * Now we analyze its time complexity:
   * 
   * let m = length of the input String array, n = repetition, str0 = the first String in the array,
   * str1 = the second String in the array...so on till lastStr, which is the last String in the
   * array:
   * 
   * T() = str0.length*(n(n-1)/2)*m + str1.length*(n(n-1)/2)*(m-1) + ... + lastStr.length*(n(n-1)/2)
   * 
   * T() = (n(n-1)/2) * (str0.length*m + str1.length*(m-1) + ... + lastStr.length).
   * 
   * Let's call aveLength = the average length of the Strings in the array. What I want to do is
   * simplifying the Strings' length factors in the complexity function. I have no clear explanation
   * why I use aveLength. I just...feel it.
   * 
   * T() ~= (n(n-1)/2) * (aveLength*m + aveLength*(m-1) + ... aveLength)
   * 
   * T() ~= (n(n-1)/2) * aveLength * (m + m - 1 + ... 1)
   * 
   * T() ~= (n(n-1)/2) * aveLength * (m(m-1)/2).
   * 
   * Thus we have T depends on 3 factors: repetition n, length of the input array: m, the average
   * length of Strings in the array: aveLength.
   * 
   * The bound of this complexity is O(n^2 * m^2 * aveLength).
   * 
   */
   
  private static void analyseProblem4() {
  
    String[] arr1 = new String[] {"Hello", "World", "my", "name", "is", "Quang"};
    String[] arr2 = new String[] {"Hey"};

    // First try
    /*
     * The input String array is: Hello World my name is Quang
     * 
     * The length of the input array is: 6
     * 
     * The number of replicate is: 5
     * 
     * The counter is: 30
     * 
     * The String result is:
     * HelloHelloHelloHelloHelloWorldWorldWorldWorldWorldmymymymymynamenamenamenamenameisisisisisQuangQuangQuangQuangQuang
     */
    String result = Problem4.concatAndReplicateAll(arr1, 5);
    pen.println(printResultProb4(arr1, 5, Problem4.getCounter(), result));

    // Second try
    /*
     * The input String array is: Hey
     * 
     * The length of the input array is: 1
     * 
     * The number of replicate is: 10
     * 
     * The counter is: 10
     * 
     * The String result is: HeyHeyHeyHeyHeyHeyHeyHeyHeyHey
     */
    result = Problem4.concatAndReplicateAll(arr2, 10);
    pen.println(printResultProb4(arr2, 10, Problem4.getCounter(), result));

    // Third try
    /*
     * The input String array is: Hello World my name is Quang
     * 
     * The length of the input array is: 6
     * 
     * The number of replicate is: 1
     * 
     * The counter is: 6
     * 
     * The String result is: HelloWorldmynameisQuang
     */
    result = Problem4.concatAndReplicateAll(arr1, 1);
    pen.println(printResultProb4(arr1, 1, Problem4.getCounter(), result));

    // Forth try
    /*
     * The input String array is: Hey
     * 
     * The length of the input array is: 1
     * 
     * The number of replicate is: 0
     * 
     * The counter is: 0
     * 
     * The String result is:
     */
    result = Problem4.concatAndReplicateAll(arr2, 0);
    pen.println(printResultProb4(arr2, 0, Problem4.getCounter(), result));
  }
  
Problem 5:
/*
   * Time complexity:
   * 
   * For this method, I choose to count:
   * 
   * - the time I access an array.
   * 
   * The inputs of the Time complexity model are the length of the first array and the length of the
   * second array. Let's call them m and n respectively. We have T(m, n) = 2(m + n).
   * 
   * The upper bound for this Time complexity model is: O(m + n).
   * 
   * This is because we loop through each array only once and we perform the adding process at O(1)
   * time complexity.
   * 
   * Space complexity:
   * 
   * For this method, I don't use recursion so the stack has space complexity = O(1).
   * 
   * I did declare a new array with length = total length of the input arrays once. So the heap space
   * complexity of this method is O(m+n).
   */
   
  private static void analyseProblem5() {
  
    int[] arr1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] arr2 = new int[] {11, 12, 13, 14, 15};
    int[] arr3 = new int[0];

    // First try
    /*
     * The first array (length = 10) is: 1 2 3 4 5 6 7 8 9 10
     * 
     * The Second array (length = 5) is: 11 12 13 14 15
     * 
     * The counter is: 30
     * 
     * The output array is: 1 11 2 12 3 13 4 14 5 15 6 7 8 9 10
     */
    int[] result = Problem5.interLeave(arr1, arr2);
    pen.println(printResultProb5(arr1, arr2, Problem5.getCounter(), result));

    // Second try
    /*
     * The first array (length = 10) is: 1 2 3 4 5 6 7 8 9 10
     * 
     * The Second array (length = 0) is:
     * 
     * The counter is: 20
     * 
     * The output array is: 1 2 3 4 5 6 7 8 9 10
     */
    result = Problem5.interLeave(arr1, arr3);
    pen.println(printResultProb5(arr1, arr3, Problem5.getCounter(), result));

    // Third try
    /*
     * The first array (length = 5) is: 11 12 13 14 15
     * 
     * The Second array (length = 0) is:
     * 
     * The counter is: 10
     * 
     * The output array is: 11 12 13 14 15
     */
    result = Problem5.interLeave(arr3, arr2);
    pen.println(printResultProb5(arr2, arr3, Problem5.getCounter(), result));
  }
  
  From my personal observation of the relationship between time and space complexity, the space complexity cannot 
  be larger than the time complexity. So if we know the time complexity, we can put an upper bound on the space 
  complexity. If we know the space complexity, we can put an lower bound on the time complexity.
