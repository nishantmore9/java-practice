package Basics;

import java.util.Arrays;

public class Sorting_1 {
  public static void main(String[] args) {
    Sorting_1 sort = new Sorting_1();
    int[] arr = {6, 1, 7, 2, 9, 5};
    sort.bubbleSort(arr);
  }

  // Selection Sort
  public void selectionSort(int[] arr) {
  /* 
    Selection Sort Algorithm : 
    - First, we will select the range of the unsorted array using a loop (say i) that indicates the starting index of the range. The loop will run forward from 0 to n-1. The value i = 0 means the range is from 0 to n-1, and similarly, i = 1 means the range is from 1 to n-1, and so on. (Initially, the range will be the whole array starting from the first index.)

    - Now, in each iteration, we will select the minimum element from the range of the unsorted array using an inner loop.

    - After that, we will swap the minimum element with the first element of the selected range(in step 1).

    - Finally, after each iteration, we will find that the array is sorted up to the first index of the range.

    - Time Complexity : O(N^2), Space Complexity : O(1)
  */
    // Loop from 0 to n - 1
    for(int i = 0; i < arr.length - 1; i++) {
      // Assume current index holds min value
      int minIndex = i;
      for(int j = i + 1; j < arr.length; j++) {
        // finding min value in remaining array
        if(arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }
      // Swaping the found min with first element of unsorted array
      int temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }
    System.out.println(Arrays.toString(arr));
  }

  // Bubble Sort
  public void bubbleSort(int[] arr) {
    /*
      Bubble Sort Algorithm : 
      - Select the range of the unsorted array: Use an outer loop (i) that runs backward from n-1 to 0 (where n is the size of the array). The value i = n-1 means the range is from 0 to n-1, i = n-2 means the range is from 0 to n-2, and so on.
      - Push the maximum element to the end of the selected range: Use an inner loop (j) that runs from 0 to i-1. Compare adjacent elements and swap them if arr[j] > arr[j+1]. Repeating this process ensures the maximum element in the current range moves to index i.
      - check in the first iteration if any swap is taking place. If the array is already sorted no swap will occur and we will break out from the loops.
      - Progressively sort the array: After each outer loop iteration, the last part of the array becomes sorted. For example:
        - After the first iteration, the element at the last index is sorted.
        - After the second iteration, the last two elements are sorted.
        - This continues until the entire array is sorted.
      Complete sorting: After n-1 iterations, the whole array will be sorted.
     */
    int n = arr.length;
    // iterate from last to first (n - 1 to 0)
    for(int i = n - 1; i > 0; i--) {
      // To check is already swap or not 
      boolean didSwape = false;
      for(int j = 0; j <= i - 1; j++) {
        if(arr[j] > arr[j + 1]) {
          int temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;
          didSwape = true;
        }
      }
      if(!didSwape) {
          break;
      }
    }
    System.out.println(Arrays.toString(arr));
  }

  // insertion Sort 
  public void insertionSort(int[] nums) {
    /*
      Insertion Sort Algorithm: 
      - In each iteration, select an element from the unsorted part of the array using an outer loop.
      - Place this selected element in its correct position within the sorted part of the array.
      - Use an inner loop to shift the remaining elements, if necessary, to accommodate the selectet element. 
      - This involves shifting elements by one position until the selected element can be placed in the correct position.
      - Continue this process until the entire array is sorted.
    */

    int n = nums.length;

    for (int i = 1; i < n; i++) {
      int key = nums[i]; // Current element as key
      int j = i - 1;

      // Shift elements that are greater than key by one position
      while (j >= 0 && nums[j] > key) {
        nums[j + 1] = nums[j];
        j--;
      }

      nums[j + 1] = key; // Insert key at correct position
    }
    System.out.println(Arrays.toString(nums));
  }
}
