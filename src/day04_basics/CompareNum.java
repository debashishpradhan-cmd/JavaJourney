package day04_basics;

import java.util.Scanner;

public class CompareNum {//find larger of the 2 numbers

    public static int largerNum(int a, int b) {

        if (a > b) {
            return a;
        } else return b;
    }

public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    System.out.print("Enter number 1: ");
    int num1 = sc1.nextInt();

    System.out.print("Enter number 2: ");
    int num2 = sc1.nextInt();

    int result = largerNum(num1, num2);

    System.out.println("Final result = " + result);
}
}
