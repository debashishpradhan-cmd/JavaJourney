package day03_basics;

import java.util.Scanner;

public class SwitchCaseTest {//Prints day of the week based on user entered number

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day's number (between 1-7): ");

        while (!sc.hasNextInt()) { // checks if entered input is an integer or not.
            System.out.print("Invalid input. Please re-enter number:"); // if non-integer, re-enter number.
            sc.next(); // read the new input provided after invalid number message.
        }

        int dow = sc.nextInt();

        switch (dow) {
            case 1:
                System.out.println("It's Monday");
                break;

            case 2:
                System.out.println("It's Tuesday");
                break;

            case 3:
                System.out.println("It's Wednesday");
                break;

            default:
                System.out.println("It's not Monday, Tuesday or Wednesday");
        }
    }
}
