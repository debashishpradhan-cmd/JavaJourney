package day01_basics;

import java.util.Scanner;

public class DigitToNumberInt {
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

       int myNum = 0;
        for (int x = 0; x < finalNum.length; x++){
            myNum = myNum*10 + finalNum[x]; //We convert the array into integer.
        }
        System.out.println(myNum);
    }
}