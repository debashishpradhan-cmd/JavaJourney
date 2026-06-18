package day01_basics;

import java.util.Scanner;

public class IntegerLengthString {
    public static void main(String[] args) { // This class stores the number of digits as a String

        // Create scanner object

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to be checked for digits: ");

        int myNum = sc.nextInt(); //save keyboard input into an integer myNum

        int DigitCount = String.valueOf(myNum).length(); //get length of keyboard input i.e. length of myNum

        System.out.println("Your number has " +DigitCount + " digits");

    }
}