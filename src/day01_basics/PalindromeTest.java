package day01_basics;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {

        //Create scanner object

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to be checked for Palindrome: ");

        int myNum = sc.nextInt();
        int originalNum = myNum;
        int k = 0;

        while (myNum>0) {

            myNum = myNum/10;
            k++;
        }

        System.out.println("Your number has " + k + " digits");

        int[] reverseNum = new int[k];

        for (int i=0; i<k; i++) {
            reverseNum[i] = originalNum % 10;
            originalNum = originalNum/10;
        }

        System.out.println("Your reverse number is " + reverseNum[k-3] + reverseNum[k-2] + reverseNum[k-1]);
        System.out.println(reverseNum);

    }
}