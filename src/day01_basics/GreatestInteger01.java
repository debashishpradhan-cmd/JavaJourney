package day01_basics;

import java.util.Scanner;

public class GreatestInteger01 { //This will find greatest integer from 3 user provided numbers.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first number: ");

        int num1 = scanner.nextInt();

        System.out.print("Please enter second number: ");

        int num2 = scanner.nextInt();

        System.out.print("Please enter third number: ");

        int num3 = scanner.nextInt();

        int largest;

        if (num1 > num2 && num1 > num3) {

            largest = num1;
        } else if (num2 > num1 && num2 > num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        System.out.println("Largest of the three numbers is: " + largest);

        scanner.close();
    }
}