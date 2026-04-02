///we used dyanmic array becaz normal array -->size fixed
/// now in the array list we can double the size of the array

// import java.util.ArrayList;

// public class arraylist {

// public static void main(String[] args) {

// // arr[0] =10
// // Scanner sc = new Scanner(System.in);

// System.out.println("Enter the Name : ");
// ArrayList<String> str  =  new ArrayList<>();
// ArrayList<Integer> arr = new ArrayList<>(6);///same as the array 6 diibe bnn



// arr.add(0, 10);
// arr.add(1, 78);
// arr.add(2, 15);
// arr.add(3, 33);
// arr.add(4, 60);
// arr.add(5, 70);

// // for (int i = 0; i < arr.size(); i++) { ///arr.size() == length of the
// // array
// // System.out.print(" "+ arr.get(i)); /// arr.get(i)-->printing k liye!
// // }

// System.out.println(arr);

// System.out.println("Output Elment in the Array List ");

// arr.set(3, 45); //// modify/replace the indx 3 element as 45
// arr.add(65); //// push back the element 65

// System.out.println(arr);
// arr.remove(1);


// str.add(0,"fib");
// str.add(1,"dil hriubjr");
// str.add(2,"dog");
// str.add(3,"i am fine");
// // str.add(0,1);

// System.out.println(str);


// }
// }

///for each loop question

// import java.util.*;

// public class arraylist {

// public static void main(String[] args) {

// int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

// for (int i : numbers) {

// System.out.print(i + " ");
// }
// }
// }
//

///sort the array or 0's and 1's ....

// import java.util.ArrayList;
// import java.util.*;

// public class arraylist {

// public static void print(int[] arr) {
// for (int t = 0; t < arr.length; t++) {
// System.out.print(arr[t] + " ");
// }
// System.out.println();
// }

// public static void main(String[] args) {

// int arr[] = { 0, 1,0 ,1};

// int n = arr.length;

// int noOFzeroes = 0;

// int noOFONES = 0;

// print(arr);

// for (int i = 0; i < n; i++) {
// if (arr[i] == 0)
// noOFzeroes++;
// else
// noOFONES++;

// }

// for (int j = 0; j < noOFzeroes; j++) {
// arr[j] = 0;
// }
// for (int j = noOFzeroes; j < n; j++) {
// arr[j] = 1;
// }
// ORR YOOU CAN DO LIKE THIS

// for (int i = 0; i < n; i++) {

// if (i < noOFzeroes)
// arr[i] = 0;
// else
// arr[i] = 1;
// }

// one paas tried.....''' TWO POINTER APPROACH
// int i = 0;
// int j = n - 1;
// while (i < j) {
// if (arr[i] == 0)
// i++;
// else if (arr[j] == 1)
// j--;
// // if(i>j) break;
// else if (arr[i] == 1 && arr[j] == 0) {
// arr[i] = 0;
// arr[j] = 1;
// i++;
// j--;
// }
// }

// print(arr);
// }
// }

///sort the array of 0's ,1's and 2's 

/// DUTCH FLAG ALGORITHM(INTERVIEW)

// import java.util.*;

// public class arraylist {

// public static void print(int[] arr) {
// for (int t = 0; t < arr.length; t++) {
// System.out.print(arr[t] + " ");
// }
// System.out.println();
// }

// public static void main(String[] args) {

// int arr[] = { 0, 1, 2, 0, 1, 2, 1, 2, 0 };

// int n = arr.length;
// int NO_of_zeros = 0;
// int NO_of_ones = 0;
// int No_of_twos = 0;
// print(arr);
// for (int i = 0; i < n; i++) {
// if (arr[i] == 0)
// NO_of_zeros++;
// else if (arr[i] == 1)
// NO_of_ones++;
// else
// No_of_twos++;

// }
// for (int i = 0; i < NO_of_zeros; i++) {
// arr[i] = 0;
// }
// for (int i = NO_of_zeros; i < (n - No_of_twos); i++) {
// arr[i] = 1;
// }
// for (int i = NO_of_ones + NO_of_zeros; i < n; i++) {
// arr[i] = 2;
// }

// OR BY ANOTHER WAY-->
// for (int i = 0; i < n; i++) {
// if (i < NO_of_zeros)
// arr[i] = 0;
// else if (i < NO_of_zeros + NO_of_ones)
// arr[i] = 1;
// else
// arr[i] = 2;

// }

// print(arr);

// }
// // }



import java.util.*;

public class arraylist {

public static void print(int[] arr) {
for (int t = 0; t < arr.length; t++) {
System.out.print(arr[t] + " ");
}
System.out.println();
}

public static void main(String[] args) {

int nums[] = { 0, 0,1,1,2,2,0};

int low = 0, mid = 0, high = nums.length - 1;

print(nums);
System.out.println(" main khel started ::  ");
while (mid < high) {
if (nums[mid] == 0) {
// Swap nums[low] and nums[mid], increment both
int temp = nums[low];
nums[low] = nums[mid];
nums[mid] = temp;
low++;
mid++;
}

else if (nums[mid] == 1) {
// Just move medium
mid++;
}

else {
// Swap nums[mid] and nums[high], decrement high
int temp = nums[mid];
nums[mid] = nums[high];
nums[high] = temp;
high--;
}
print(nums);
}

System.out.println("The last array will be : ");

print(nums);
}
}

// Merge the two sorted arrays 1D

// import java.util.*;

// public class arraylist {

// public static void print(int[] arr) {
// for (int t = 0; t < arr.length; t++) {
// System.out.print(arr[t] + " ");
// }

// System.out.println();
// }

// public static void main(String[] args) {

// int arr[] = { 11, 34, 52, 99 };
// int brr[] = { 2,3,23, 33, 44, 67,100 };
// int crr[] = new int[arr.length + brr.length];
// // int n = arr.length;
// // int m = brr.length;
// int i = 0, j = 0, k = 0;

// while (i < n) {
// crr[k++] = arr[i++];//here indexing and it is increasing also!!
// }

// while (j < m) {
// crr[k++] = brr[j++];
// }

// Arrays.sort(crr);
// print(crr);

// }

// while (i < arr.length && j < brr.length) {
// if (arr[i] <= brr[j])

// crr[k++] = arr[i++];

// else
// crr[k++] = brr[j++];

// }
// if (i == arr.length)///now take elements from b only
// {
// while (j < brr.length)
// crr[k++] = brr[j++];

// }
// if (j == brr.length) { ///now take elements from a only
// while (i < arr.length) {

// crr[k++] = arr[i++];
// }
// }
// print(crr); 
// }

// }

//// 
/// 
/// 


// import java.util.*;

// public class arraylist {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number :");
//         int a = sc.nextInt();
//         int arr[] = { 1, 2, 3, 3, 4, 4, 4 };
//         for (int ele : arr) {
//             System.out.print(ele + " ");
//         }
//     }

// }

