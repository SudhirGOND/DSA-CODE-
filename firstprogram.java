
//  public class firstprogram {

//      public static void main(String[] args) {
//              int x =4,y=3,c =3;
//          System.out.println("hii"+x+y+c);//string +  aage ka bhi string bnn gya
//          System.out.println(5+6+" hiii ");//integer aaya phle to sum ho gya

//      }

//  }

//using double data types

//public class firstprogram {

//     public static void main(String[] args) {

//         System.out.println("hii");

//         double x = 7;
//         double y = 9;
//         double z = y / x;
//         System.out.println(z);

//     }

// }

// public class firstprogram {

//     public static void main(String[] args) {
//         double m1 = 32; // marks in english
//         double m2 = 66; // marks in hindi
//         double m3 = 78; //marks in science
//         double m4 = 98; // marks in maths
//         double m5 = 99; // marks in SST
//         double avg = (m1 + m2+ m3+ m4+ m5)/5;

//         System.out.println(avg);
//     }

// }

//aveage of 4 subjects having maximum marks are 60!!

// public class firstprogram {

// //@SuppressWarnings("unused")
//     public static void main(String[] args) {
//         double Maths_marks = 45;
//         double english = 34;
//         double python = 58;
//         double hindi = 60;
//         double avg = (Maths_marks + english + python + hindi)/2.4;

//         System.out.print(avg);

//     }
// }

//area of a circle //using % percentage sign

// public class firstprogram {

//     public static void main(String[] args) {
//         double radius = 100;
//         double pi = Math.PI;
//         double area = (pi * radius * radius);
//         System.out.printf("%.4f  ", area);
//         System.out.println(area);
//         System.out.println(pi);
//     }
// }

//taking input sum of two numbers

// import java.util.Scanner;

// public class firstprogram {
//     @SuppressWarnings("resource")
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the 1st Number :");
//         int x = sc.nextInt();
//         System.out.print("Enter the 2nd Number :");
//         int y = sc.nextInt();
//         int sum = x+y;
//         System.out.println("Sum of two numbers:"+sum);
//     }

// }

//finding remainder using 9th  class method
// import java.util.*; //* is used as scanner */

// public class firstprogram {
//     int x;

//     @SuppressWarnings("resource")
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the Dividend :");
//         int x = sc.nextInt();
//         System.out.print("Enter the Divisor :");
//         int y = sc.nextInt();
//         int r;//remainder
//         if (x >= y) {
//              r = x - y * (x / y);
//             System.out.print("The remainder on dividing "+x+" by "+y+" is "+r);
//         }
//         else
//         System.out.println("The remainder is "+x);
//     }
// }
//

//finding remainder using modulus operator

// import java.util.*;

// public class firstprogram {

//     @SuppressWarnings("resource")
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Dividend :");
//         int x = sc.nextInt();
//         System.out.print("Enter the Divisor :");
//         int y = sc.nextInt();
//         int r; // remainder
//         r = x % y;
//         System.out.println("Remainder "+r);

//     }
// }

//predict the output

// public class firstprogram {

//     public static void main(String[] args) {
//         int i = 2, j = 3, k, l;
//         double a, b;
//         // Same precedence so ,associativity is from left to right ;
//         k = i / j * j;// = 0
//         l = j / i * i;// = 2
//         a = i / j * j;// = 0.0
//         b = j / i * i;// 2.0
//         System.out.println(k + " " + l + " " + a + " " + b);
//     }
// }

