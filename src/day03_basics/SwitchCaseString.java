package day03_basics;

import java.util.Scanner;

public class SwitchCaseString {

    public static void main(String[] args) {

        System.out.print("Enter your choice of Browser: ");
        Scanner sc = new Scanner(System.in);

        while (!sc.hasNext("[a-zA-Z]+")){ //checking for non-string inputs and giving warning
            System.out.println("No non-integral values! Please select from: chrome, firefox");
            sc.next();
        }

        String myBrowser = sc.next().toLowerCase(); //reads user input and converts to lower case.

        switch (myBrowser) {
            case "chrome":
                System.out.println("Launching Google Chrome");
                break;

            case "firefox":
                System.out.println("Launching Mozilla Firefox");
                break;

            default:
                System.out.println("Invalid input");
        }

    }
}
