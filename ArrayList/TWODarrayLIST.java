// import java.util.*;

// public class TWODarrayLIST {

//     public static void main(String[] args) {

//         // List<Integer> a = new ArrayList<>();
//         // a.add(56);
//         // a.add(90);
//         List<Integer> a = new ArrayList<>(Arrays.asList(56, 90));

//         List<Integer> b = new ArrayList<>();
//         b.add(23);
//         b.add(34);
//         b.add(45);
//         List<Integer> c = new ArrayList<>();
//         List<List<Integer>> L = new ArrayList<>();
//         L.add(a);
//         L.add(b);
//         L.add(c);

//         // System.out.println(a + " \n" + b + " ");

//         // for (int i = 0; i < L.size(); i++) {
//         // System.out.println(L.get(i));

//         // }

//         // single element printing
//         // System.out.println(L.get(0).get(0));

//         for (int i = 0; i < L.size(); i++) {
//             for (int j = 0; j < L.get(i).size(); j++) {
//                 System.out.print(L.get(i).get(j) + " ");
//             }
//         }
//         // add()= =add from the back
//         // remove() = remove from the back
//         // get() = return the liist
//         // clear() == clear all the elements in the array List
//         //isEmpty() = check the emptyness of the array
//         //Contains() = check the element is in the list??

//     }
// }

//twod matrix multiplication..

// public class TWODarrayLIST {
//     public static void Print(int a[][]) {
//         for (int i = 0; i < a.length; i++) {
//             for (int j = 0; j < a[0].length; j++) {
//                 System.out.print(a[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {

//         int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//         int brr[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };

//         int crr[][] = new int[arr.length][brr[0].length];

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < brr[0].length; j++) {

//                 for (int k = 0; k < arr[0].length; k++) {
//                     crr[i][j] += arr[i][k] * brr[k][j];
//                 }

//             }
//         }
//         Print(crr);

//     }
// }

// public class TWODarrayLIST {

//     // Method to print the 2D array
//     public static void Print(int a[][]) {
//         for (int i = 0; i < a.length; i++) {
//             for (int j = 0; j < a[0].length; j++) {
//                 System.out.print(a[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {

//         // Test cases for edge cases
//         int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//         int brr[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };

//         // Edge Case 1: Empty matrices
//         if (arr.length == 0 || brr.length == 0 || arr[0].length == 0 || brr[0].length == 0) {
//             System.out.println("Error: One or both matrices are empty.");
//             return;
//         }

//         // Edge Case 2: Matrix dimension mismatch check
//         if (arr[0].length != brr.length) {
//             System.out.println("Error: Matrix dimensions are incompatible for multiplication.");
//             return;
//         }

//         // Get matrix dimensions
//         int rowsArr = arr.length;
//         int colsArr = arr[0].length;
//         int colsBrr = brr[0].length;

//         // Resultant matrix
//         int crr[][] = new int[rowsArr][colsBrr];

//         // Matrix multiplication
//         for (int i = 0; i < rowsArr; i++) {
//             for (int j = 0; j < colsBrr; j++) {
//                 int sum = 0;  // Accumulate the result
//                 for (int k = 0; k < colsArr; k++) {
//                     sum += arr[i][k] * brr[k][j];
//                 }
//                 crr[i][j] = sum;
//             }
//         }

//         // Print the result
//         Print(crr);
//     }
// }

///Score After The Flipping.... 861 leetcode

// public class TWODarrayLIST {
// public static void Print(int[][] arr) {
// for (int i = 0; i < arr.length; i++) {

// for (int t = 0; t < arr[0].length; t++) {
// System.out.print(arr[i][t] + " ");
// }
// System.out.println();
// }
// }

// public static void main(String[] args) {
// int arr[][] = { { 0, 0, 1, 1 },
// { 1, 1, 1, 0 },
// { 1, 1, 0, 0 } };

// int m = arr.length, n = arr[0].length;
// Print(arr);
// System.out.println();
// ///now we first make 1st position of the matrix is 1

// for (int i = 0; i < m; i++) {

// if (arr[i][0] == 0) {
// for (int j = 0; j < n; j++) {
// if (arr[i][j] == 0)
// arr[i][j] = 1;
// else
// arr[i][j] = 0;
// }

// }

// }

// // now we have to make the columns zeroe>ones --<opposite
// for (int j = 1; j < n; j++) { ///we are checking from the second(index = 1)
// column
// int zeros = 0, ones = 0;
// for (int i = 0; i < m; i++) {
// if (arr[i][j] == 0)
// zeros++;
// else
// ones++;

// }
// if (zeros > ones) {
// for (int i = 0; i < m; i++) {
// if (arr[i][j] == 0)
// arr[i][j] = 1;
// else
// arr[i][j] = 0;
// }

// }
// }
// int maxscore = 0;

// for (int i = 0; i < m; i++) {
// int p = 1;
// for (int j = n - 1; j >= 0; j--) { ///piche se aage aaya hain
// maxscore += arr[i][j] * p;
// p *= 2;
// }

// }

// Print(arr);
// System.out.println();
// System.out.println(maxscore);

// }

// }

// class Solution {

// public int matrixScore(int[][] arr) {
// int m = arr.length;
// int n = arr[0].length;
// // sabhi 1 ko 1st position of the array ko lao!!
// for (int i = 0; i < m; i++) {
// if (arr[i][0] == 0) {
// for (int j = 0; j < n; j++) {
// if (arr[i][j] == 0)
// arr[i][j] = 1;
// else
// arr[i][j] = 0;
// }
// }
// }

// // flipping the columns having more than 1 zeroes
// for (int j = 1; j < n; j++) {
// int zeroes = 0;
// int ones = 0;
// for (int i = 0; i < m; i++) {

// if (arr[i][j] == 0)
// zeroes++;
// else
// ones++;
// }
// if (zeroes > ones) {
// for (int i = 0; i < m; i++) {
// if (arr[i][j] == 0)
// arr[i][j] = 1;
// else
// arr[i][j] = 0;
// }
// }

// }

// int matrixScore = 0;
// int x = 1;
// for (int j = n - 1; j >= 0; j--) {
// for (int i = 0; i < m; i++) {
// matrixScore += (arr[i][j] * x);

// }
// x *= 2;
// }
// return matrixScore;
// }
// }


///checking the time requirement in the  codes
// public class Main {
//     public static void main(String[] args) {
//         int[][] matrix = {
//                 { 1, 4, 7, 11 },
//                 { 2, 5, 8, 12 },
//                 { 3, 6, 9, 16 }
//         };
//         int target = 5;

//         long startTime = System.currentTimeMillis(); // Start timing

//         boolean result = searchMatrix(matrix, target);

//         long endTime = System.currentTimeMillis(); // End timing

//         System.out.println("Found: " + result);
//         System.out.println("Execution Time: " + (endTime - startTime) + " ms");
//     }

//     public static boolean searchMatrix(int[][] arr, int target) {
//         int m = arr.length;
//         int n = arr[0].length;

//         // Brute-force search
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (arr[i][j] == target) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }


