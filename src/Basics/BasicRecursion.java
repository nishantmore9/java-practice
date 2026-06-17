package Basics;


public class BasicRecursion {
  public static void main(String[] args) {
    // String name = "Nishant";
    int n = 5;
    //printNames(name, 0, n);
    // print1toN(n, 1);
    // System.out.println(sumOfN(n));
    // System.out.println(factorial(n));
    // int[] arr = {1,2,3,4,5};
    // reverseArray(arr, 0, arr.length - 1);
    // System.out.println(Arrays.toString(arr));
    for(int i = 0; i < n; i++) {
      System.out.println(fibonacci(i) + " ");
    }
  }  

  // Print name n times
  static void printNames(String name, int count, int n) {
    if (count == n) {
      return;
    }
    System.out.println(name);

    printNames(name, count + 1, n);
  }

  // Print 1 to N 
  static void print1toN(int N, int count) {
    if(count > N )
      return;

    print1toN(N, count + 1);
    
    System.out.print(count+" ");
  }

  // Sum of first N numbers
  static int sumOfN(int N) {
    if(N == 1)
      return 1;
    return N + sumOfN(N - 1);
  }
  // dry run 
  // for N = 5 : 5 + sum(4)
  // for N = 4 : 4 + sum(3)
  // for N = 3 : 3 + sum(2)
  // for N = 2 : 2 + sum(1)
  // for N = 1 : 1 
  // backtrack 
  // 2 + 1 = 3
  // 3 + 3 = 6
  // 4 + 6 = 10
  // 5 + 10 = 15

  // Factorial of N 
  static int factorial(int N) {
    if(N == 1)
      return N;
    return N * factorial(N - 1);
  } 

  // Reverse the array
  static void reverseArray(int[] arr, int i, int j) {
    if(i > j) {
      return;
    }
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

    reverseArray(arr, i + 1, j - 1);
  }

  // Print Fibonacci
  static int fibonacci(int N) {
    if(N <= 1) {
      return N;
    }

    return fibonacci(N - 1) + fibonacci(N - 2);
  }
}