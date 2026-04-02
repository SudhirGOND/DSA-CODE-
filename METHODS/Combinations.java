// import java.util.Scanner;

// public class Combinations {
// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the N: ");
// int N = sc.nextInt();
// System.out.print("Enter the R: ");
// int R = sc.nextInt();
// System.out.printf("The NCR is %dC%d : %d", N, R, NCR(N, R));
// sc.close();
// }

// public static int NCR(int N, int R) {

// int NFACT = 1;
// int RFACT = 1;
// int NR_FACT = 1;
// for (int i = 2; i <= N; i++) {
// NFACT = NFACT * i;
// }
// for (int i = 2; i <= R; i++) {
// RFACT = RFACT * i;
// }
// for (int i = 2; i <= (N - R); i++) {
// NR_FACT = NR_FACT * i;

// }

// return NFACT / (RFACT * NR_FACT);
// }
// }

///Function of factorial that gives you combination of the given number...
// import java.util.Scanner;

// public class Combinations {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the N: ");
//         // int N = sc.nextInt();
//         // System.out.print("Enter the R: ");
//         // int R = sc.nextInt();
//         System.out.println(FACT(12));
//         // System.out.printf("The NCR is %dC%d : %d", N, R, FACT(N) / (FACT(R) * FACT(N
//                 // - R)));
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
