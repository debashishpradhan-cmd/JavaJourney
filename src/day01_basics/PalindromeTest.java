package day01_basics;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {

        //Create scanner object

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to be checked for Palindrome: ");

        int myNum = sc.nextInt(); //capture user input and store as an integer

        String myNumString = String.valueOf(myNum); //convert the integer to String

        int numLength = String.valueOf(myNum).length();

        int i = 0;
        String revNum = "";

        System.out.println("Number of digits = " + numLength);

        while (i < numLength) {
            revNum = revNum + myNumString.charAt(numLength - i - 1);
            i++;
        }

        System.out.println("Reverse Number is " + revNum);

        if (myNumString.equals(revNum)) {
            System.out.println("Yeah! We have a Palindrome");
        } else {
            System.out.println("Nope! Not a Palindrome");
        }
    }
}