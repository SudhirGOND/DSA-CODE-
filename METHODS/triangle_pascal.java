import java.util.Scanner;

// Program to print Pascal's Triangle using factorial method
public class TrianglePascal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows for Pascal's Triangle
        System.out.print("Enter the number of Rows: ");
        int I = sc.nextInt();

        // Outer loop for each row
        for (int i = 0; i <= I; i++) {

            // Print spaces for proper alignment
            for (int j = 0; j <= I - i; j++) {
                System.out.print("  "); // Two spaces for formatting
            }

            // Print the values in the row using combination formula
            for (int j = 0; j <= i; j++) {
                int ICJ = FACT(i) / (FACT(j) * FACT(i - j));
                System.out.print(ICJ + "   "); // Extra spaces for spacing
            }

            System.out.println(); // Move to next row
        }

        sc.close();
    }

    public static int FACT(int X) {
        int XFACT = 1;

        // Multiply XFACT by each number from 2 to X
        for (int i = 2; i <= X; i++) {
            XFACT = XFACT * i;
        }

        return XFACT;
    }
}
