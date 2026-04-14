
import java.util.*;

public class array {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int arr[] = { 1000, 235, 5, 56, 323, 44, 340 };
Arrays.sort(arr);
for (int i = 0; i < arr.length; i++) {
System.out.print(" " + arr[i]);
}
}
}

// /Given an array of marks of students,
// / if the mark of any student is less than 35
// / print the roll number as (i)-->

import java.util.*;

public class array {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int marks[] = {23 ,56,78,332,2,4,45};
System.out.print("roll_Number of student got less than 35 :");

for(int i =0; i< marks.length;i++){
if(marks[i]< 35){
System.out.print(" "+i);
}
}
}
}

///Calculate the sum of the array in the given  context;

import java.util.Scanner;

public class array {

public static void main(String[] args) {

try {
int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

int sum = 0;
for (int i = 0; i < arr.length; i++) {
sum += arr[i];

}
System.out.print("The sum of the elements of array : " + sum);

}

catch (ArrayIndexOutOfBoundsException e) {
System.out.print("Kindly perform in limits: within the right indexing:");
}
}
}

// given the number x in the array and find the number index or not present

import java.util.*;
public class array {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number to search : ");
int x = sc.nextInt();
int arr[] = { 23, 444, 34, 4, 454, 56, 5, 32, 90, 2322, 787, 868, 8 };
for (int i = 0; i < arr.length; i++) {
if (arr[i] == x) {
System.out.print("MIl GAYA " + " at index " + i);
break;
} else if (i == arr.length) {
System.out.print("NHi MILA");
}
}
}
}

//find out the max value out all the elements in the array:

import java.util.*;

public class array {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int arr[] = new int[5];

////inpuut taking from user :
System.out.println("Enter the 5 Integers : ");
for (int i = 0; i < arr.length; i++) {
arr[i] = sc.nextInt();

}
int max = Integer.MIN_VALUE;
////output taking from user
for (int i = 0; i < arr.length; i++) {
if (arr[i] > max) {
max = arr[i];
}
}

// System.out.print("the maximum of all : " + max);

// }

// }
// finding the second maximum in the ARRAY that given:;

import java.util.*;

public class array {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int arr[] = new int[5];

////inpuut taking from user :
System.out.println("Enter the 5 Integers : ");
for (int i = 0; i < arr.length; i++) {
arr[i] = sc.nextInt();

}
int max = Integer.MIN_VALUE;
////output taking from user
for (int i = 0; i < arr.length; i++) {
if (arr[i] > max) {
max = arr[i];
}
}

// System.out.print("the maximum of all : " + max);
int smax = Integer.MIN_VALUE;
for (int i = 0; i < arr.length; i++) {

if (arr[i] > smax && arr[i] != max) { ////(arr[i]< max ) this (also give
// min.value when
// all elements are equal) is invalid becaz increase the value in that!!
smax = arr[i];
}

// }
System.out.println("The maximum in the array :" + max);
if (smax == Integer.MIN_VALUE) {
System.out.println("No second maximum (all elements might be equal).");
} else {
System.out.println("The second maximum in the array: " + smax);
}

}

}

/// two sum codes leetcode
/// 
/// 

import java.util.*;

public class array {
public static void main(String[] args) {
// Scanner sc = new Scanner(System.in)
int arr[] = { 1, 2, 3, 4, 45, 5, 66, 6, 7, 756, 450 };
int brr[] = new int[arr.length];
for (int i = 0; i < arr.length; i++) {
brr[i] = arr[arr.length - 1 - i];
////this concept is more pertinent(loop bdd rha prr hum piche se access krrr
// rhee!!)
}
for (int t = 0; t < brr.length; t++) {
System.out.print(" " + brr[t]);
}
}
}

///reverse of the array using   TWO POINTERS METHOD
 
import java.util.*;

public class array {
public static void print(int[] arr) {
for (int t = 0; t < arr.length; t++) {
System.out.print(arr[t] + " ");
}
System.out.println();
}

public static void main(String[] args) {

int arr[] = { 1, 2, 33, 434, 5445, 5, 655, 66, 6767, 67 };
print(arr);
int i = 0; // left
int j = arr.length - 1; // right
while (i < j) {
int temp = arr[i];// swapping happening
arr[i] = arr[j];
arr[j] = temp;
i++; ///left increasing
j--; ////right decreasing
}
print(arr);
}
}

///rotate the given array "a" by the k steps, where k is non-negative
///rotate by the left style 





import java.util.*;

public class array {

    public static void print(int[] arr) {
        for (int t = 0; t < arr.length; t++) {
            System.out.print(arr[t] + " ");
        }
        System.out.println();
    }

    public static void Reverse(int[] arr, int i, int j) {
        i = 0; // left
        j = arr.length - 1; // right
        while (i < j) {
            int temp = arr[i];// swapping happening
            arr[i] = arr[j];
            arr[j] = temp;
            i++; ///left increasing
            j--; ////right decreasing
        }
    }

public static void main(String[] args) {
//// 0 1 2 3 4 5 6 7
int arr[] = { 23, 4, 12, 3, 4312, 112, 2 };
// 23 4 12 3 4312 112 2 --->reverse == 2 112 4312 3 12 4 23
// After rotation by 2--< 12 3 4312 112 2 23 4
Scanner sc = new Scanner(System.in);

System.out.print("Enter the rotating index : ");

int K = sc.nextInt();
print(arr);

K = K % arr.length;
/// from right rotation to the left
// Reverse(arr, 0, arr.length - 1);///reverse the whole array
// Reverse(arr, 0, K - 1);///reverse the 1st part of the array
// Reverse(arr, K, arr.length - 1);///right answer

//trying left rotation to right-->k= 2 //23, 4, 12, 3, 4312, 112, 2 
Reverse(arr, 0, K - 1);///0 se k-1 takk ..reverse ho rha--12 4 23 3 4312 112 2
Reverse(arr, K, arr.length - 1);////12 4 23- 2 112 4312 3
Reverse(arr, 0, arr.length - 1);///3 4312 112 2 23 4 12
print(arr);

}

}

import java.util.ArrayList;

public class array {
public static void main(String[] args) {
ArrayList<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
names.add("Charlie");

// for (String name : names) { //
System.out.println(name);
}
}
}

///next greatest number 


import java.util.Scanner;

public class array {

    public static void main(String[] args) {

        int arr[] = { 12, 3, 23, 45, 67, 112, 234, 3, 44, 61, 78 };
        int n = arr.length;
        int[] ans = new int[n];
        ans[n - 1] = -1;
        for (int i = 0; i < n - 1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                max = Math.max(max, arr[j]);
            }
            ans[i] = max;
        }
        for (int t : ans) {
            System.out.print(" " + t);
        }
    }
}


