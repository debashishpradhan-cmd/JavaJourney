package day02_basics;

import java.util.Scanner;

public class SwitchCaseTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");

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
