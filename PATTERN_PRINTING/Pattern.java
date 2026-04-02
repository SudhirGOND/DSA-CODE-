
// * * * * 
// * * * *
// * * * *
// * * * *
// * * * *

// import java.util.Scanner;

// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the rows number : ");
//         int row = sc.nextInt();
//         System.out.print("Enter the column number: ");
//         int column = sc.nextInt();
//         for (int i = 1; i <= row; i++) {
//             for (int j = 1; j <= column; j++) {
//                 System.out.print("* ");

//             }
//             System.out.println();
//         }

//     }
// }

// 1 2 3 4 
// 1 2 3 4 
// 1 2 3 4 
// 1 2 3 4 

// import java.util.Scanner;

// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the rows number : ");
//         int row = sc.nextInt();

//         for (int i = 1; i <= row; i++) {
//             for (int j = 1; j <= row; j++) {
//                 System.out.print(j + " ");

//             }
//             System.out.println();
//         }

//     }
// }

// 1 1 1 1 
// 2 2 2 2 
// 3 3 3 3
// 4 4 4 4 

// import java.util.Scanner;

// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the rows number : ");
//         int row = sc.nextInt();

//         for (int i = 1; i <= row; i++) {
//             for (int j = 1; j <= row; j++) {
//                 System.out.print(i + "   ");

//             }
//             System.out.println();
//         }

//     }
// }

// 

// A  A  A  A  A  A  
// B  B  B  B  B  B  
// C  C  C  C  C  C  
// D  D  D  D  D  D  
// E  E  E  E  E  E

// import java.util.Scanner;

// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the rows number : ");
//         int row = sc.nextInt();
//         System.out.print("Enter the column number: ");
//         int column = sc.nextInt();
//         for (int i = 1; i <= row; i++) {
//             for (int j = 1; j <= column; j++) {
//                 System.out.print((char) (i + 64) + "  ");
//             }
//             System.out.println();
//         }

//     }
// }

//print the below pattern

// *  
// *  *
// *  *  *
// *  *  *  *
// *  *  *  *  *
// *  *  *  *  *  *

// import java.util.Scanner;
// public class Pattern {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the rows number : ");
//         int row = sc.nextInt();

//         for (int i = 1; i <= row ; i++) {
//             for (int j = 1; j <= i ; j++) {
//                 System.out.print("*  ");
//             }
//             System.out.println();
//         }

//     }
// }

// 1 
// 1 2
// 1 2 3 
// 1 2 3 4
// 1 2 3 4 5
/// 

// import java.util.Scanner;
// public class Pattern {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the rows number : ");
//         int row = sc.nextInt();

//         for (int i = 1; i <= row ; i++) {
//             for (int j = 1; j <= i ; j++) {
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }

//     }
// }

//
// 1 
// A B
// 1 2 3
// A B C D
// 1 2 3 4 5

// import java.util.Scanner;

// public class Pattern {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the rows number : ");
//         int row = sc.nextInt();

//         for (int i = 1; i <= row; i++) {
//             for (int j = 1; j <= i; j++) {
//                 if (i % 2 != 0) {
//                     System.out.print(j + " ");
//                 } else
//                     System.out.print((char)(j+64)+ " ");

//             }
//             System.out.println();
//         }

//     }
// }

// *  *  *  *  *  *   
// *  *  *  *  *
// *  *  *  *
// *  *  *
// *  *
// *

// import java.util.Scanner;

// public class Pattern {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the rows number : ");
//         int row = sc.nextInt();
//         for (int i = 0; i < row; i++) {   //outer loop n times run karega !!
//             for (int j = 1; j <= row-i; j++) { //innner loop n se 0 times..

//                 System.out.print("*  ");
//             }
//             System.out.println();
//         }
//     }
// }

// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2
// 1

// import java.util.*;

// public class Pattern {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the rows number : ");
//         int row = sc.nextInt();
//         for (int i = 0; i < row; i++) {// outer loop
//             for (int j = 1; j <= row  - i; j++) {// inner loop is--->
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//
///WRONG APROACH YOU HAVE TAKEN
// 1
// 1
// 1 3
// 1 3
// 1 3 5

// import java.util.*;

// public class Pattern {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the rows number : ");
//         int row = sc.nextInt();

//         for (int i = 1; i <= row; i++) {// outer loop

//             for (int j = 1; j <= i; j++) {// inner loop is--->

//                 if (j % 2 != 0) {
//                     System.out.print(j + " ");
//                 } else
//                     continue;
//             }
//             System.out.println();
//         }
//     }
// }


//



// import java.util.*;

// public class Pattern {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the rows number : ");
//         int row = sc.nextInt();

//         for (int i = 1; i <= row; i++) {   // outer loop
//             for (int j = 1; j <= (2*j +1); j++) { // inner loop is--->
                
//                 System.out.print(j + " ");
            
//             }
//             System.out.println();
//         }
//     }
// }



// 