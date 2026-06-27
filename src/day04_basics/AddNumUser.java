package day04_basics;

import java.util.Scanner;

public class AddNumUser {//Add 2 numbers provided dynamically by user

    public static int addition(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter first number a: ");
        int a = sc1.nextInt();

        System.out.print("Enter second number b: ");
        int b = sc1.nextInt();

        int result = addition(a, b);

        System.out.println("Result is " + result);
    }
}
