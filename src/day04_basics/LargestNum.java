package day04_basics;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {

        System.out.print("How many numbers do you want to compare: ");
        Scanner sc = new Scanner(System.in);
        int countNum = sc.nextInt();//stores the number of integers provide by user
        int[] myNumber = new int[countNum]; // array of integers provided by user

        int i = 0;
        while (i < countNum) {
            System.out.print("Enter the number: ");
            myNumber[i] = sc.nextInt();
            i++;
        }

        int greatestNum = myNumber[0];

        for (int k = 1; k < countNum; k++) {//assuming myNumber[0] is greatest number
            if (myNumber[k] > greatestNum) {

                greatestNum = myNumber[k];

            } //else greatestNum = myNumber[0];
        }

        System.out.print("greatest num = " + greatestNum);
    }
}



