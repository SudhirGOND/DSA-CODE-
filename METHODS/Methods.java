// METHODS BY RAGHAV SIR!!!
// that are used to perform the repeatitive task 

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want : ");
        int num = sc.nextInt();
        System.out.print("Enter the power : ");
        int pow = sc.nextInt();
        int power = 1;
        for (int i = 1; i <= pow; i++) {
            power *= num;
        }
        sc.close();
        System.out.println("Enter the number : " + power);

    }
}

// WAP to print the number of the
// import java.util.*;
// public class Methods {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the numbers : ");
// double num1 = sc.nextDouble();
// double num2 = sc.nextDouble();
// double num3 = sc.nextDouble();
// // System.out.println(Math.pow(num1, num2));///square function
// System.out.println("Greatest of the three is : " + Math.max(num3,
// Math.max(num1, num2)));
// System.out.println(Math.sqrt(num3));
// System.out.println(Math.cbrt(num1));
// System.out.println(Math.abs(-56));
// }
// }

//

import java.util.Scanner;

public class Methods {

public static void Khabar()
{
for(int i=1 ; i<= 10;i++){
System.out.print(i+" ");
}
System.out.println();
}
public static void naam() {
// System.out.println();
System.out.println("Enter the number you want: ");
}

public static void sum(int a, int b) {
System.out.println("The sum is "+(a+b));
}

public static void main(String[] args) {

// naam(); ///calling the function///methods from main to naam()
// Khabar();
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
sum(a, b);

System.out.println("Enter the Good marks: ");

}
}

///WAF to print the name , age ,student class ,grade!!

// public class Methods {

// public static void studentBiodata(String name, int age, String studentClass,
// String grade) {

// System.out.println("Name: " + name + ", Age: " + age + ", Class: " +
// studentClass + ", Grade: " + grade);
// }

// public static void main(String[] args) {
// studentBiodata("RAJU", 34, "C.S.E", "A");
// }
// }
