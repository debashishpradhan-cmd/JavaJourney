package day02_basics;

import java.util.Scanner;

public class WhileLoopTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be printed backwards: ");
        int i = sc.nextInt();
                        while (i > 0) {
            System.out.println(i); //This will print from 14 to 5 in the console.
            i--;
        }
    }
}