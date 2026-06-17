package Basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BasicHashing {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // // Number hashing 
    // int n = sc.nextInt();
    // int[] arr = new int[n];
    
    // for(int i = 0; i<n;i++) {
    //   arr[i] = sc.nextInt();
    // }

    // // Pre Compute
    // int[] hash = new int[13];

    // for(int i = 0; i<n;i++) {
    //   hash[arr[i]] += 1;
      
    // }

    // int q = sc.nextInt();

    // for(int i = 0; i < q; i++) {
    //   int number = sc.nextInt();
    //   // Fetching 
    //   System.out.println(hash[number]);
    // }

    // // Character Hashing
    // String str = sc.next();
    // int[] charHash = new int[26];
    
    // // Pre Compute
    // for(int i = 0; i<str.length();i++) {
    //   charHash[str.charAt(i) - 'a']++;
    // }

    // // System.out.println(Arrays.toString(charHash));

    // int qr = sc.nextInt();
    // while(qr-- != 0) {
    //   char c = sc.next().charAt(0);
    //   // Fetching
    //   System.out.println(charHash[c - 'a']);
    // }

    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    HashMap<Integer, Integer> map = new HashMap<>();

    for(int i = 0; i < n; i++) {
      int key = arr[i];
      int freq = 0;
      if(map.containsKey(key))
        freq = map.get(key);
      freq++;
      map.put(key, freq);
    }
    
    for (Map.Entry<Integer, Integer> it : map.entrySet()) {
      System.out.println(it.getKey() + "->" + it.getValue());
    }

    // int q = sc.nextInt();
    // while (q-- > 0) {
    //   int num = sc.nextInt();
    //   if(map.containsKey(num))
    //     System.out.println(map.get(num));
    //   else 
    //     System.out.println(0);
    // }

    // sc.close();
  }
}
