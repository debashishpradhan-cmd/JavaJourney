package day04_basics;

import java.util.Scanner;

public class SquareCalc {

    public static int calculateSquare(int number) {//this method returns the square of a number

        return number * number;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to be squared: ");
        int testNum = sc.nextInt();

        int result = calculateSquare(testNum);

        System.out.println("Square of the entered number is: " + result);

        sc.close();//since we do not need teh scanner anymore.
    }
}
