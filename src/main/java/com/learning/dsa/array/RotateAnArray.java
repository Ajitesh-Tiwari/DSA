package com.learning.dsa.array;

/**
 * URL - https://www.geeksforgeeks.org/array-rotation/
 */

public class RotateAnArray {

  public static void rotate(int[] arr, int d) {
    d = d % arr.length;
    int[] removed = new int[d];
    for (int i = 0; i < arr.length; i++) {
      if (i < d) {
        removed[i] = arr[i];
      } else {
        arr[i - d] = arr[i];
      }
    }

    for (int i = 0; i < d; i++) {
      arr[arr.length - d + i] = removed[i];
    }
  }

  public static void reversal(int[] arr, int l, int r) {
    while (l < r) {
      int temp = arr[l];
      arr[l] = arr[r];
      arr[r] = temp;
      l++;
      r--;
    }
  }
}
