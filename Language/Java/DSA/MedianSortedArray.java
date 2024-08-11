// // import java.util.Arrays;

// public class MedianSortedArray {
// public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
// int size = nums1.length + nums2.length;
// int[] mergedArray = new int[size];

// // Merge the arrays
// int k = 0;
// for (int i = 0; i < nums1.length; i++) {
// mergedArray[i] = nums1[i];
// }
// for (int j = nums1.length; j < size; j++) {
// mergedArray[j] = nums2[k];
// k++;
// }

// // Sort the merged array
// Arrays.sort(mergedArray);

// // Calculate the median
// if (size % 2 == 1) {
// return mergedArray[(size - 1) / 2];
// } else {
// return (mergedArray[size / 2] + mergedArray[(size / 2) - 1]) / 2.0;
// }
// }

// public static void main(String[] args) {
// long start, end;
// start = System.currentTimeMillis();
// // ------------------------------------------------------START

// // int[] nums1 = { 1, 3 };
// // int[] nums2 = { 2 };
// // int[] nums1 = {1, 3};
// // int[] nums2 = {2, 4};
// // double median = findMedianSortedArrays(nums1, nums2);
// // System.out.println("Median: " + median);

// // ------------------------------------------------------END
// end = System.currentTimeMillis();
// double time = (end - start) / 1000.0;
// System.out.println("Time: " + time);
// }
// }