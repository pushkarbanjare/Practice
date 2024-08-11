// // import java.util.*;

// public class MergedSortedArray {
// // public static void mergeArray(int[] nums1, int m, int[] nums2, int n) {
// // int size = nums1.length;
// // int[] mergedArray = new int[size];
// // int halfSize = nums1.length/2;

// // // first array merge
// // for (int i = 0; i < halfSize; i++) {
// // mergedArray[i] = nums1[i];
// // }

// // // second array merge
// // for (int i = halfSize, j = 0; i < size; i++, j++) {
// // mergedArray[i] = nums2[j];
// // }

// // // mergedArray sorted
// // Arrays.sort(mergedArray);

// // for(int a = 0; a < size; a++){
// // System.out.print(mergedArray[a] + " ");
// // }
// // System.out.println();
// //
// ==============================================================================================
// // // Initialize pointers for nums1, nums2, and the end of nums1
// // int p1 = m - 1;
// // int p2 = n - 1;
// // int p = m + n - 1;

// // // While there are elements in both nums1 and nums2
// // while (p1 >= 0 && p2 >= 0) {
// // if (nums1[p1] > nums2[p2]) {
// // nums1[p] = nums1[p1];
// // p1--;
// // } else {
// // nums1[p] = nums2[p2];
// // p2--;
// // }
// // p--;
// // }

// // // If there are remaining elements in nums2, copy them over to nums1
// // while (p2 >= 0) {
// // nums1[p] = nums2[p2];
// // p2--;
// // p--;
// // }

// // for (int i = 0; i < m+n; i++) {
// // System.out.print(nums1[i] + " ");
// // }
// // }

// public static void main(String[] args) {
// long start, end;
// start = System.currentTimeMillis();
// // ------------------------------------------------------START
// // int[] a = { 1, 2, 3, 0, 0, 0 };
// // int[] b = { 2, 5, 6 };
// // int m = 3;
// // int n = 3;
// // mergeArray(a, m, b, n);
// // ------------------------------------------------------END
// end = System.currentTimeMillis();
// double time = (end - start) / 1000.0;
// System.out.println("Time: " + time);
// }
// }
