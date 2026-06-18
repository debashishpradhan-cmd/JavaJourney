package day01_basics;

import java.util.Scanner;

public class IntegerLengthMath {
    public static void main(String[] args) { // This class stores the number of digits as an integer

        //Create scanner object

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to be checked for digits: ");

        int myNum = sc.nextInt(); //save keyboard input into an integer myNum

        int k = 0;

       while (myNum > 1) {
           myNum = myNum/10;
           k++;
        }

        System.out.println("Your number has " +k + " digits"); //Here 'k' stores no. of digits
        //since it is an integer, this value of 'k' can be used mathematically, unlike in a String.

    }
}