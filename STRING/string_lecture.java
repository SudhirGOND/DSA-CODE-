// import java.util.Scanner;

// public class string_lecture {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// System.out.println();
// String t = sc.next();

// String s2 = s.concat(t);
// System.out.println(s2);
// String str = "i am raju";
// String s1 = str.substring(0);

// System.out.println(s1);
// System.out.print(str.substring(3)); // return all the string from idex 5
// to...infinite
 
// }
// }

////good questions from the raghav sir!

//  import java.util.*;

//  class string_lecture {

//  public static void main(String[] args) {
//  Scanner sc = new Scanner(System.in);
//  String s = "abcd";
//  for (int i = 0; i <= 3; i++) {
//  for (int j = i + 1; j <= 4; j++) {
//  System.out.print(s.substring(i, j) + " ");
//  }
//  System.out.println();
//  }
//  }
//  }

// public class string_lecture{

// public static void main(String[] args) {

// // // interning simply means to Save Space()
// // // same string ke liye new space nhin create hota hai
// // // ossi string ko dono varialble point krte hain

// // // new keyword ka use kreke we can allocate the new space in the memory same
// // // string

// String s = "Kaju";
// String a = "Ramu";
// String v = "Ramu";// same space used

// String X = new String("Ramu");// for 'Ramu' String extra space allocated in
// // the memory
// // // s.charAt(0) = "R";///can't change the indexed values
// // // System.out.println(s);

// // ///String Ki immutability features gives poor performance

// // // str.equals() or ==

// // // == it checks the address of the str you are comparing
// // //it checks the string only

// // System.out.println(a==v);//same address...true
// // System.out.println(a==X);//diff..address..false

// System.out.println(X.equals(a));//

// }
// }

///STRING BULIDERS

// public class string_lecture {

// public static void main(String[] args) {
// StringBuilder str = new StringBuilder("hello");

// str.append("kaju katlli");
// System.out.println(str);
// str.setCharAt(0, 'D');// index prr modify krr sakte hain!!

// System.out.println(str);
// str.insert(2, "Y");//index element insert
// System.out.println(str);
// str.deleteCharAt(0);//index element delete
// System.out.println(str);
// int i = 0;
// int j = str.length();
// str.reverse();
// System.out.println(str);
//
//
// }
// }

///You can reverse the string without the using reverse function 
/// 

// public class string_lecture {
// public static void main(String[] args) {
// String original = "Hello World";
// char[] chars = original.toCharArray();//Conversion

// int left = 0;
// int right = chars.length - 1;

// while (left < right) {
// // Swap characters
// char temp = chars[left];
// chars[left] = chars[right];
// chars[right] = temp;

// left++;
// right--;
// }

// String reversed = new String(chars);
// System.out.println("Reversed string: " + reversed);
// }
// }

// Brute Force Approach--<

// public class string_lecture {
// public static void main(String[] args) {
// String original = "Hello World";
// String reversed = "";

// for (int i = original.length() - 1; i >= 0; i--) {
// reversed += original.charAt(i); // Not efficient for long strings
// }

// System.out.println("Reversed string: " + reversed);
// }
// }

/// Given a string , the task is to toggle all the charaters of hte string 
// / to convert upper to lower and vice - versa.


// public class string_lecture {

//     public static String toggleChar(String str) {
//         String result = "";
        
//         // Iterate over the original string
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
            
//             // Check the case of the character and
//             // toggle accordingly
//             if (Character.isUpperCase(ch))
//                 result += Character.toLowerCase(ch);
//             else
//                 result += Character.toUpperCase(ch);
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         String str = "GeEkSfOrGeEkS";
//         String x = toggleChar(str);
//         System.out.println(x);
//     }
// }

// input = PhysiCS
// o/p = pHYSIcs

// import java.util.*;

// public class string_lecture {

// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// String str = new String(sc.nextLine());
// // StringBuilder str = new StringBuilder(sc.nextLine());

// for (int i = 0; i < str.length(); i++) {
// boolean flag = true; // capital hai
// char ch = str.charAt(i);
// int ascii = (int) ch;
// if (ch == ' ')
// continue;

// if (ascii >= 97)
// flag = false;// small
// if (flag == true) {
// ascii += 32;
// char dh = (char) ascii;
// // str.setCharAt(i, dh);
// str = str.substring(0, i) + dh + str.substring(i + 1);

// } else {
// ascii -= 32;
// char dh = (char) ascii;
// //str.setCharAt(i, dh);
// // raghav == rag += H += av
// str = str.substring(0, i ) + dh + str.substring(i+1);

// }

// }
// System.out.println(str);
// }
// }

///checking if the string is palindrome or not 
/// with using of the functions

import java.util.*;
import java.lang.*;

public class string_lecture {

public static void main(String[] args) {

String str = "aba";
StringBuilder gtr = new StringBuilder(str);  

gtr.reverse();

if (gtr.toString().equals(str)) {
System.out.print("palindrome");
} else {
System.out.print("Not palindrome");
}
}
}

///With the Using Of the logics only

// import java.util.*;

// public class string_lecture {

// public static void main(String[] args) {
// String str = "abccba";
// int i = 0;
// int j = str.length() - 1;
// boolean flag = false; //
// while (i < j) {
// if (str.charAt(i) != str.charAt(j)) {
// flag = true;
// // System.out.println(" Not Palindrome");
// break;
// }
// i++;
// j--;

// }

// if (flag == false)
// System.out.println("Palindrome");
// else
// System.out.println("Not Palindrome");

// }
// }

// given a string s , return the number of palindromic substrings in it .

// input == "abc";
// output == 3

// public class string_lecture {

// public static boolean isPalindrome(String str) {
// int i = 0, j = str.length() - 1;
// boolean flag = true;// palindrome

// while (i < j) {
// if (str.charAt(i) != str.charAt(j)) {
// flag = false;// not palindrome
// break;
// // return false;
// }
// i++;
// j--;
// }
// if (flag == true)
// return true;
// else
// return false;
// }

// public static void main(String[] args) {

// // Finding the number of the substrings..
// String str = "abc";
// int cout = 0;
// for (int s = 0; s <= str.length() - 1; s++) {
// for (int t = s + 1; t <= str.length(); t++) {

// if (isPalindrome(str.substring(s, t))) {
// System.out.print(str.substring(s, t) + " ");
// cout++;
// }
// }
// }
// System.out.print("\nThe numbers of the palindromic substrings : " + cout);
// }
// }

///reverse the every words of a sentence ...of strings-->

// public class string_lecture {

// public static void main(String[] args) {

// String str = " Dhoom 786 From punjab";
// String ans = "";
// StringBuilder sb = new StringBuilder("");
// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);
// if (ch != ' ') {
// sb.append(ch);
// // System.out.println(sb);
// } else {///yadi ch == ' '
// sb.reverse();
// ans += sb;
// ans += " ";
// sb = new StringBuilder("");

// }

// }

// sb.append(" ");
// sb.reverse();
// System.out.println(ans + "" + sb);

// }
// }

// The string should be compressed such that consecutive duplicattes of
// characters are reolaced with the character and followed by the number of
// consecutive duplicates..

// input == aaabbbbccddde
// output == a3b4c2d3e

// import java.util.*;

// public class string_lecture {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String str = "abbbbccddde";
// String ans = "" + str.charAt(0);// a
// int count = 1;

// for (int i = 1;i< str.length(); i++) {

// char curr = str.charAt(i);
// char prev = str.charAt(i - 1);
// if (curr == prev) {
// count++;
// }

// else {
// if(count>1)
// ans += count;
// count = 1;
// ans += curr;

// }

// }
// if(count>1) ////1 baar hoga osko aise hi chodd denge
// ans += count;

// System.out.print(ans);

// }
// }

///
/// 


