package Basics;

public class Prac_01 {
  public static void main(String[] args) {
    // Patterns 
    int n = 5;

    //1. rectangle 
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        System.out.print("* " );
      }
      System.out.println(" ");
    }

    // 2. Right-Angled Triangle Pattern
    // int count = 1;
    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= i; j++) {
        System.out.print(i);
      }
      System.out.println(" ");
      // count = 1;
    }
    
    //Inverted Right Pyramid
    int count = 1;
    for(int i = 0; i < n; i++) {
      for(int j = i; j < n; j++) {
        System.out.print(count++);
      }
      System.out.println();
      count = 1;
    }

    //Star Pyramid
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      for(int j = 0; j < 2 * i + 1; j++) {
        System.out.print("*");
      }
      // for(int j = 0; j < n - i - 1; j++) {
      //   System.out.print(" ");
      // }
      System.out.println();
    }
    
    //inverted star pyramid
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for(int j = 0; j < 2 * n - (2 * i + 1) ; j++) {
        System.out.print("*");
      }
      for(int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
    
    // Half Diamond Star Pattern
    for(int i = 0; i < n; i++) {
      for(int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    for(int i = 0; i < n; i++) {
      for(int j = i; j < n - 1 ; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    for(int i = 1; i <= 2*n - 1; i++) {
      int star = i;
      if(i>n) 
        star = 2*n - i;
      for(int j = 1; j <= star ; j++) {
        System.out.print("*");
      }
      System.out.println();
    } 
      
  }
}
