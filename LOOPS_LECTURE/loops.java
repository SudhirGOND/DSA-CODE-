
// import java.util.*;
// public class loops 
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the iteration times:");
//         int a = sc.nextInt();
//         for (int i = 1; i <= a; i++)
//         System.out.println("RAmu KAKA");
//         sc.close();
//     }
// }

// going to print an AP

// import java.util.*;
// public class loops {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the number of terms : ");
// int a = sc.nextInt();
// for (int i = 1; i <= 2 * a - 1; i += 2)
// System.out.print(i + " ");
// sc.close();
// }
// }

// going to print an AP that is >>>  3, 7, 11, 15, 19...

//here we apply the AP formula --- a+(n-1)*d

// import java.util.Scanner;

// public class loops {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of terms: ");
//         int NO_Of_trms = sc.nextInt();
//         int a = 3, d = 4;
//         for (int i = 1; i <= NO_Of_trms; i++) {
//             System.out.print(a + " ");
//             a += d;
//         }
//         sc.close();
//     }
// }

// The series of G.P -->1 2 4 8 16 32 ....upto n terms
// a = 3, r = 2;

// import java.util.Scanner;
// public class loops {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter The Number: ");
//         int n = sc.nextInt();
//         int a = 1;
//         int r = 2;

//         for (int i = 0; i <= n; i++) {
//             System.out.print(a + " ");
//             a *= r;

//         }

//     }
// }

//BREAK  STATEMENT ;

// loop == body repeats until condition is false;
//break == an break the loop 

// wap to find the highest fator oof number 'n'(other than n itself)

// import java.util.Scanner;

// public class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number : ");
//         int n = sc.nextInt();
//         int HF = 1;
//         for (int i = 1; i <= n / 2; i++) {
//             if ((n % i) == 0) {
//                 System.out.print(i + " ");
//                 HF = i;
//             }
//         }
//         System.out.println("");
//         System.out.print("The highest factor is : " + HF);
//     }
// }

// wap to check the number is prime or composite..

// import java.util.Scanner;
// public class loops {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the number : ");
// int n = sc.nextInt();
// boolean flag = false;
// for (int i = 2; i < n; i++) {
// if (n % i == 0) {
// flag = true;
// break;
// }
// }
// if (flag != false)
// System.out.println("Composite Number");
// else
// System.out.println("Prime Number");

// sc.close();
// }
// }

// import java.util.Scanner;

// public class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the upper limit: ");
//         int n = sc.nextInt();

//         System.out.println("Prime numbers up to " + n + " are:");

//         for (int num = 2; num <= n; num++) {
//             boolean isPrime = true;

//             for (int i = 2; i <= Math.sqrt(num); i++) {
//                 if (num % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }

//             if (isPrime) 
//                 System.out.print(num + " ");
//         }

//         sc.close();
//     }
// }

// CONTINUE STATEMNENT USING 
// import java.util.Scanner;
// public class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//             if (i % 18 == 0)
//                 continue;
//             if (i % 2 == 0 || i % 3 == 0) {
//                 System.out.print(i + " ");
//             }

//         }
//         sc.close();
//     }
// }

//Count the digits of the number input!!

// import java.util.Scanner;

// public class loops {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter The Number : ");

//         int num = sc.nextInt();
//         sc.close();
//         int count = 0;
//         if (num == 0)
//             count++;
//         while (num != 0) {
//             num /= 10;
//             count++;

//         }
//         System.out.print("Number of digits : " + count);

//     }
// }

// WAP to sum the digits of no.
// import java.util.Scanner;

// public class loops {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter The Number : ");
//         int num = sc.nextInt();
//         int sum = 0;
//         while (num > 0) {
//             int last_digit = num % 10;
//             sum += last_digit;
//             num /=10; 
//         }
//         System.out.print("Number's Sum: " + sum);

//     }
// }

// WAP to sum the of all the even digits of a given number!

// import java.util.Scanner;

// public class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter The Number : ");
//         int num = sc.nextInt();
//         int sum = 0;
//         while (num > 0) {
//             int last_digit = num % 10;
//             if (last_digit % 2 == 0) {
//                 sum += last_digit;
//             }
//             num /= 10;
//         }
//         System.out.print("Even Number's Sum: " + sum);
//     }
// }

// WAP to reverse the digits of the given number 

// import java.util.Scanner;

// public class loops {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter The Number : ");
//         int num = sc.nextInt();
//         int product = 0;
//         while (num > 0) {
//             int last_digit = num % 10;
//             product = product*10 + last_digit;
//             num /=10;
//         }
//         System.out.print("Reverse of digits : " + product);

//     }
// }

// WAP TO FIND THE FACTORIAL OF NUMBER

// import java.util.Scanner;

// public class loops {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter The Number : ");
//         int num = sc.nextInt();
//         int product = 1;
//         for (int i = 2; i <= num; i++) {
//             product = product * i;

//         }
//         System.out.print("Factorial of the numbers is: " + product);

//     }
// }


//print factorial in each liine...


// import java.util.Scanner;
// public class loops {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter The Number : ");
//         int num = sc.nextInt();
//         int product = 1;
//         for (int i = 1; i <= num; i++) {
//             product = product * i;
//             System.out.println(product);
//         }
       

//     }
// }



