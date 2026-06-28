package day04_basics;

import java.util.Scanner;

public class evenOrOdd {//decide if user entered integer is odd/even number.

    public static String calcEvenOdd(int k) {

        if (k % 2 == 0) {
            return "even";
        } else return "odd";

    }

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter number: ");
        int testNum = sc1.nextInt();

        String result = calcEvenOdd(testNum);

        System.out.println("The number is: " + result);

    }
}
