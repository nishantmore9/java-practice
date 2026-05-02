package Basics;

import java.util.Scanner;

public class BasicMath {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    // int digitCount = countDigits(num);
    // int revDigit = reverseDigit(num);
    // boolean isPanlindrome = isPanlindrome(num);
    //boolean isArmstrong = isArmstrong(num);
    // System.out.println("Digit Count: "+digitCount);
    // System.out.println("Reverse of Number: "+revDigit);
    // System.out.println("is Palindrome: "+isPanlindrome);
    //System.out.println("is Armstrong: "+isArmstrong);
    printDivisors(num);
    sc.close();
  }

  // Count the digits of a Number 
  static int countDigits(int num) {
    // int count = 0;
    // while(num > 0) {
    //   count++;
    //   num = num/10;
    // }
    // return count;

    // optimal approch 
    int cnt = (int) Math.log10(num) + 1;
    return cnt;
  }

  // Reverse Digits of A Number
  static int reverseDigit(int num) {
    int rev = 0;
    while (num > 0) {
      int lastDigit = num % 10;
      rev = rev * 10 + lastDigit;
      num /= 10;
    }
    return rev;
  }

  // Check number is palindrome or not
  static boolean isPanlindrome(int num) {
    if(num == 0) 
      return true;
    return num == reverseDigit(num);
  }

  // Check number armstrong is not 
  static boolean isArmstrong(int num) {
    int original = num;
    int sum = 0;

    while (num > 0) {
        int digit = num % 10;
        sum = sum + (digit * digit * digit);
        num /= 10;
    }
    return sum == original;
  }

  // print divisors
  static void printDivisors(int num) {

  for(int i = 1; i * i <= num; i++) {
    if(num % i == 0){
      System.out.print(i + " ");

      // print paired divisor
      if(i != num / i) {
        System.out.print(num / i + " ");
      }
    }
  }
}
}
