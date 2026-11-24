package day02_basics;

import java.util.Scanner;

public class IntegerLengthString {
    public static void main(String[] args) { // This class stores the number of digits as a String

        Scanner sc = new Scanner(System.in); // Create scanner object

        System.out.print("Enter the number to be checked for digit count: ");

        long myNum = sc.nextLong(); //using long instead of int to handle more than 10 digits.

        int DigitCount = String.valueOf(myNum).length(); //convert myNum to string and fetch its length.

        System.out.println("Your number has " + DigitCount + " digits");

    }
}