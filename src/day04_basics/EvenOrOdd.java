package day04_basics;

import java.util.Scanner;

public class EvenOrOdd {//decide if user entered integer is odd/even number.

    public static String calcEvenOdd(int k) {

        if (k % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int testNum = sc.nextInt();

        String result = calcEvenOdd(testNum);

        System.out.println(testNum + " is an " + result + " number");

    }
}
