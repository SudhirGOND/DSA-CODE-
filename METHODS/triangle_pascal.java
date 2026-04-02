// import java.util.Scanner;

// public class Combinations {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the N: ");
// int N = sc.nextInt();
// System.out.print("Enter the R: ");
// int R = sc.nextInt();
// System.out.printf("The NCR is %dC%d : %d", N, R, FACT(N) / (FACT(R) * FACT(N
// - R)));
// sc.close();
// }

// import java.util.Scanner;

// public class triangle_pascal {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Rows:I  ");
//         int I = sc.nextInt();
//         // System.out.print("Enter the Col:J ");
//         // int J = sc.nextInt();

//         for (int i = 0; i <= I; i++) {

//             for (int j = 0; j <= I - i; j++) {///i is inceasing and the j is kaam ho rha hai!!
//                 System.out.print("  ");

//             }

//             for (int j = 0; j <= i; j++) {
//                 int ICJ = FACT(i) / (FACT(j) * FACT(i - j));
//                 System.out.print(ICJ + "   ");

//             }

//             System.out.println();

//         }

//         sc.close();
//     }

//     public static int FACT(int X) {
//         int XFACT = 1;
//         for (int i = 2; i <= X; i++) {
//             XFACT = XFACT * i;
//         }
//         return XFACT;
//     }
// }
