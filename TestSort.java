// 3.1 construc testing

import static org.junit.Assert.*;

public class TestSort {
  public class Sort {
    /* following the instruction of 3.1 */
    public static void sort(String[] x) {
      sort(x, 0);
      // selection sort the rest

    }
    public static int findSmallest(String[] x, int start) {
      int res = start;
      int len = x.length;
      for (int i = start + 1; i < len; i++) {
        int cmp = x[i].compareTo(x[res]);
        if (cmp < 0) {
          res = i;
        }
      }
      return res;
    }
    public static void swap(String[] x, int a, int b) {
      String tmp = x[a];
      x[a] = x[b];
      x[b] = tmp;
    }
    // helper func to slice array, also recur helper
    private static void sort(String[] x, int start) {
      if (start >= x.length) {
        return;
      }
      // find the smallest item
      int smallestIdx = findSmallest(x, start);
      // move it to the front
      swap(x, start, smallestIdx);
      sort(x, start + 1);
    }
    /* my own implement */
    public static int[] selectionSort(int[] originalArray) {
      int len = originalArray.length;
      int[] res = new int[len];
      int smallestIdx;
      int tmpSmall;
      int tmpInt;
      for (int i = 0; i < len; i++) {
        smallestIdx = i;
        tmpSmall = originalArray[i];
        for (int j = i + 1; j < len; j++) {
          if (tmpSmall > originalArray[j]) {
            tmpSmall = originalArray[j];
            smallestIdx = j;
          }
        }
        tmpInt = originalArray[i];
        originalArray[i] = tmpSmall;
        originalArray[smallestIdx] = tmpInt;
        //;
        //System.out.println(java.util.Arrays.toString(originalArray));
        //;
      }
      return originalArray;
    }
  }

  public static void testSortString() {
    String[] input = {"i", "have", "an", "egg"};
    String[] expected = {"an", "egg", "have", "i"};
    Sort.sort(input);
    /* the general selfmade test
    for (int i = 0; i < input.length; i += 1) {
        if (!input[i].equals(expected[i])) {
            System.out.println("Mismatch in position " + i + ", expected: " + expected + ", but got: " + input[i] + ".");
            break;
        }
    }
    */
    /* the JUnit test lib */
    assertArrayEquals(expected, input);
  }
  public static void testSortIntArray() {
    int[] input = {3,2,5,4,1};
    int[] expected = {1,2,3,4,5};
    int[] res = Sort.selectionSort(input);
    org.junit.Assert.assertArrayEquals(expected, res);
  }

  public static void main(String[] args) {
    //testSortIntArray();
    testSortString();
  }
}
