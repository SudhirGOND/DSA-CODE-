import java.util.*;

public class IF_ELSE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");

        int b = sc.nextInt();
        sc.close();
        System.out.println(a + b);

    }
}

// checking it is Square or not 

import java.util.Scanner;

public class IF_ELSE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length:");
        int length = sc.nextInt();
        System.out.print("Enter the Breadth:");
        int breadth = sc.nextInt();

        if (length == breadth) {
            System.out.print("It is Square:");
        } else {
            System.out.print("It is not Square:");
        }
        sc.close();
    }
}

// Checking it is divisible by 5 but not 3

import java.util.*;

public class IF_ELSE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        int a = sc.nextInt();
        if (a % 5 == 0 && a % 3 != 0) {
            System.out.print("Only divisible by 5");
        } else {
            System.out.print("Not hitting the required condition ");
        }
        sc.close();
    }
}

// checking the valdity of triangle

import java.util.Scanner;

public class IF_ELSE {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First side  :");
        int a = sc.nextInt();

        System.out.print("Enter the Second side :");
        int b = sc.nextInt();

        System.out.print("Enter the Third side :");
        int c = sc.nextInt();

        if ((a + b > c) && (b + c > a) && (c + a > b)) 
        {
            System.out.print("This is Valid triangle ");
        } else
            System.out.print("Not a valid triangle ");

        sc.close();

    }
}

// cheacking the greatest  between 3 numbers

import java.util.Scanner;

public class IF_ELSE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
       
       
        //taking input as float number
        float a = sc.nextFloat();


        System.out.print("Enter the second number :");
        float b = sc.nextFloat();
        System.out.print("Enter the third number :");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.print(a + "is greatest :");
            } else // a<c
            {
                System.out.print(c + "is greatest :");
            }
        } else // a<b
        {
            if (b > c) {
                System.out.print(b + " is greatest :");
            } else // c>b
            {
                System.out.print(c + " is greatest ");
            }
        }
        sc.close();

    }
}

