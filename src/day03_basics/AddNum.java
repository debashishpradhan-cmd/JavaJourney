package day03_basics;

import java.util.Scanner;

public class AddNum {//This program will add two integers provided by the user.

    public static void main(String[] args) {

        System.out.print("Enter the first number: ");//Prompt user for 1st integer
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();

        System.out.print("Enter the second number: ");//Prompt user for 2nd integer
        int num2 = sc1.nextInt();

        System.out.println("The answer is: " + (num1 + num2));
    }
}
