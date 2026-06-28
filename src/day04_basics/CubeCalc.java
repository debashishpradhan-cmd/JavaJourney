package day04_basics;

import java.util.Scanner;

public class CubeCalc {

    public static int calculateCube(int number) {// this method returns the cube of a number

        return number * number * number;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to be cubed: ");
        int testNum = sc.nextInt();

        int result = calculateCube(testNum);

        System.out.println("Cube of the entered number is: " + result);

        sc.close();// since we do not need the Scanner anymore.
    }
}
