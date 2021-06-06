package com.learning.dsa.array;

import static com.learning.dsa.array.RotateAnArray.reversal;
import static com.learning.dsa.array.RotateAnArray.rotate;

import org.junit.Test;

public class RotateAnArrayTest {

  @Test
  public void usingExtraArray() {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    rotate(arr, 2);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  @Test
  public void reversalMethod() {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    reversal(arr, 0, 1);
    reversal(arr, 2, 6);
    reversal(arr, 0, 6);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
