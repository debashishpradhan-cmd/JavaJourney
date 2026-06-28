package day03_basics;

import java.util.Scanner;

public class SwitchCaseOperator {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter the operator (*,/,+,-): ");
        String myOps = sc1.next();

        System.out.print("Enter number1: ");
        int a = sc1.nextInt();

        System.out.print("Enter number2: ");
        int b = sc1.nextInt();

        switch (myOps) {

            case "+":
                System.out.print("Sum of the numbers is: " + (a + b));
                break;

            case "-":
                System.out.print("Difference of the numbers is: " + (a - b));
                break;

            case "*":
                System.out.print("Product of the numbers is: " + (a * b));
                break;

            case "/":
                System.out.println("Division of the numbers is: " + (a / b));
                break;

            default:
                System.out.println("Please enter a valid option");
                break;
        }
    }
}
