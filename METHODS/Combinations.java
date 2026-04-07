import java.util.Scanner;

public class Combinations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the N: ");
        int N = sc.nextInt();

        System.out.print("Enter the R: ");
        int R = sc.nextInt();

        System.out.printf("The NCR is %dC%d : %d", N, R, NCR(N, R));

        sc.close();
    }

    public static int NCR(int N, int R) {

        int NFACT = 1;
        int RFACT = 1;
        int NR_FACT = 1;

        for (int i = 2; i <= N; i++) {
            NFACT = NFACT * i;
        }

        for (int i = 2; i <= R; i++) {
            RFACT = RFACT * i;
        }

        for (int i = 2; i <= (N - R); i++) {
            NR_FACT = NR_FACT * i;
        }

        return NFACT / (RFACT * NR_FACT);
    }
}

///// this is the code of the factorial
import java.util.Scanner;

public class Combinations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input N
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        // Input R
        System.out.print("Enter the value of R: ");
        int R = sc.nextInt();

        // Calculate and display N!
        System.out.println("Factorial of " + N + " is: " + factorial(N));

        // Calculate and display combination (N choose R)
        int combination = factorial(N) / (factorial(R) * factorial(N - R));
        System.out.printf("The combination %dC%d is: %d%n", N, R, combination);

        sc.close();
    }

   
    public static int factorial(int X) {
        int result = 1;
        for (int i = 2; i <= X; i++) {
            result *= i;  // Multiply result by i in each iteration
        }
        return result;
    }
}




