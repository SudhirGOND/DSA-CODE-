import java.util.*;

public class TWODarray {

    public static void chhap(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // int arr[][] = new int[4][3];
        // arr[0][0] = 5;
        // arr[2][2] = 10;
        // arr[0][1] = 14;
        // arr[0][2] = 5;
        // arr[1][1] = 45;
        // arr[1][2] = 23;
        // chhap(arr); /// printing the 2d array in matrix form

        // int m = arr.length;///length of the row
        // int n = arr[0].length;// length of the col

        // System.out.println(m + " " + n);

        // printing of the 2d array of using for each statement
        int arr[][] = { { 1, 2, 3, 023 }, { 2, 45, 45, 23 } };

        for (int[] is : arr) {
            for (int a : is) {
                System.out.print(" " + a);
            }
            System.out.println();
        }
    }
}

find the sum of the array all elements

import java.util.*;

public class TWODarray {
    public static void chhap(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.print("Enter the matrix : \n");
        // taking input from user
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();

            }
        }

        chhap(arr); // printing of the array --> calling method||

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
        sum = sum + arr[i][j];
        }
        }

        System.out.print("The sum of the elements of matrix : " + sum);


        // int max = Integer.MIN_VALUE;

    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < arr.length; j++) {
    //             max =  Math.max(max,arr[i][j]);
    //         }
    //     }
    //     System.out.print(" Max Number Is : " + smax);
    }
}

//////Addition of the 2 arrays 






import java.util.Scanner;

public class TWODarray {

    public static void chhap(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];
        int brr[][] = new int[3][3];

        System.out.print("Enter the matrix1 : \n");
        // ---<> taking input from USER -->MATRIX 1

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();

            }
        }

        System.out.print("Enter the matrix2 : \n");
        // ---<> taking input from USER -->MATRIX 2

        for (int s = 0; s < arr.length; s++) {
            for (int t = 0; t < arr.length; t++) {
                brr[s][t] = sc.nextInt();

            }
        }

        chhap(arr);
        chhap(brr);
        int result[][] = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                result[i][j] = arr[i][j] + brr[i][j];
            }
        }

        System.out.println("Resultant matrix : \n");
        chhap(result);
    }
}

//transpose of the Matrix  ---867 leetcode problem

import java.util.*;
public class TWODarray {
    public static void chhap(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // Intialisation of the array!!
        int brr[][] = new int[3][3];
        chhap(arr);

        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // brr[i][j] = arr[j][i];
        // }
        // }

        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }

        System.out.println();
        chhap(arr);
    }

}

/write a program to rotate a matix of the 90 degree... 

public class TWODarray {

public static void PRINT(int[][] a) {

// printing of the array

for (int i = 0; i < a.length; i++) {
for (int j = 0; j < a[0].length; j++) {
System.out.print(a[i][j] + " ");
}
System.out.println();
}
}

public static void main(String[] args) {

int arr[][] = { { 1, 2, 3, 10 }, { 4, 5, 6, 11 }, { 6, 7, 8, 12 }, { 23, 34,
56, 78 } };
int m = arr.length; // rows
int n = arr[0].length; // cols
PRINT(arr);
System.out.println();

int brr[][] = new int[n][m];

for (int i = 0; i < n; i++) {
for (int j = 0; j < m; j++) {
brr[i][j] = arr[j][i];
}
}
PRINT(brr);

////making reversing the elements of the array
System.out.println();
for (int i = 0; i < brr.length; i++) {
int a = 0;
int b = brr.length - 1;

// temporary changes occur..only for 3 matrix
while (a < b) {

int temp = brr[i][a];
brr[i][a] = brr[i][b];
brr[i][b] = temp;
a++;
b--;
}
}
PRINT(brr);
}
}

// write a program of spiral matrix //as waveform motion

public class TWODarray {

    public static void PRINT(int[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {

                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = arr.length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

    }
}

Make the matrix spiral in the same way ...

import java.util.*;

public class TWODarray {
    public static void PRINT(int[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int maxc = arr[0].length-1, minc = 0;
        int maxr = arr.length-1, minr = 0;
        PRINT(arr);
        System.out.println();
        while (minr <= maxr && minc <= maxc) {
            /// for blue lines

            for (int j = minc; j <= maxc; j++) {
                System.out.print(arr[minr][j] + " ");
            }
            minr++;
            if (minr > maxr || minc > maxc)
                break;
            ///orange lines
            for (int i = minr; i <= maxr; i++) {
                System.out.print(arr[i][maxc] + " ");
            }
            maxc--;
            if (minr > maxr || minc > maxc)
                break;
            ///red lines 
            for (int j = maxc; j >= minc; j--) {
                System.out.print(arr[maxr][j] + " ");

            }
            maxr--;
            if (minr > maxr || minc > maxc)
                break;
        ///green lines
            for (int i = maxr; i >= minr; i--) {
                System.out.print(arr[i][minc]+" ");
            }
            minc++;

            if (minr > maxr || minc > maxc)
                break;

        }
System.out.println();
        PRINT(arr);
    }
}
/// the below is the error free written by the chatgpt
import java.util.*;

public class TWODarray {

    // printing function
    public static void chhap(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { // FIXED
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // sum of all elements
    public static int sum(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { // FIXED
                sum += arr[i][j];
            }
        }
        return sum;
    }

    // addition of two matrices
    public static int[][] add(int a[][], int b[][]) {
        int rows = a.length;
        int cols = a[0].length;

        int res[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        return res;
    }

    // transpose (in-place)
    public static void transpose(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    // rotate 90 degree (clockwise)
    public static void rotate90(int arr[][]) {
        transpose(arr);

        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = arr[i].length - 1;

            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    // wave print
    public static void wave(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    // spiral print
    public static void spiral(int arr[][]) {
        int minr = 0, maxr = arr.length - 1;
        int minc = 0, maxc = arr[0].length - 1;

        while (minr <= maxr && minc <= maxc) {

            // top row
            for (int j = minc; j <= maxc; j++) {
                System.out.print(arr[minr][j] + " ");
            }
            minr++;

            // right column
            for (int i = minr; i <= maxr; i++) {
                System.out.print(arr[i][maxc] + " ");
            }
            maxc--;

            if (minr <= maxr) {
                // bottom row
                for (int j = maxc; j >= minc; j--) {
                    System.out.print(arr[maxr][j] + " ");
                }
                maxr--;
            }

            if (minc <= maxc) {
                // left column
                for (int i = maxr; i >= minr; i--) {
                    System.out.print(arr[i][minc] + " ");
                }
                minc++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3, m = 3;

        int arr[][] = new int[n][m];
        int brr[][] = new int[n][m];

        System.out.println("Enter matrix 1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter matrix 2:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                brr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix 1:");
        chhap(arr);

        System.out.println("\nMatrix 2:");
        chhap(brr);

        // sum
        System.out.println("\nSum of matrix1 elements: " + sum(arr));

        // addition
        int result[][] = add(arr, brr);
        System.out.println("\nAddition:");
        chhap(result);

        // transpose
        transpose(arr);
        System.out.println("\nTranspose of matrix1:");
        chhap(arr);

        // rotate
        rotate90(arr);
        System.out.println("\nRotate 90 degree:");
        chhap(arr);

        // wave
        System.out.println("\nWave print:");
        wave(arr);

        // spiral
        System.out.println("\nSpiral print:");
        spiral(arr);

        sc.close();
    }
}


