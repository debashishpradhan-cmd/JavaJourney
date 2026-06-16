package day01_basics;

import java.util.Scanner;

public class DigitToNumber {
    public static void main(String[] args) {

        //Create scanner object

        Scanner sc = new Scanner(System.in);

        System.out.print("How many digits are there in your Number: ");

        int totalDigits = sc.nextInt();
        int[] finalNum = new int[totalDigits];
        int i = 0;

        while (i < totalDigits) {
            System.out.print("Enter the digit number " + (i + 1) + ": ");
            finalNum[i] = sc.nextInt();
            i++;
        } //ask the user to enter each digit sequentially and save it in the array 'finalNum'

        for (int k = 0; k < totalDigits; k++) {
            System.out.print(finalNum[k]);
            //print the array elements into a number. It is essentially a string and not a number.

        }
    }
}