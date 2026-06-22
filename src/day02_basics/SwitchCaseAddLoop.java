package day02_basics;

import java.util.Scanner;

public class SwitchCaseAddLoop {//This program will add two integers provided by the user.

    public static void main(String[] args) {

        System.out.print("Enter the number of integers you want to add: ");
        Scanner sc1 = new Scanner(System.in);
        int numIntegers = sc1.nextInt();
        int numAnswer = 0;

        while (numIntegers > 0) {
            System.out.print("Enter the number: ");
            Scanner sc2 = new Scanner(System.in);
            int userInput = sc2.nextInt();
            numAnswer = numAnswer + userInput;
            numIntegers--;

            System.out.println("Final result = " + numAnswer);
        }
    }
}
