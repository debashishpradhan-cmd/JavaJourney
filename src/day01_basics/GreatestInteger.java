package day01_basics;

public class GreatestInteger { //This will find greatest integer from 3 pre-defined numbers.

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = 35;
        int num3 = 20;

        int largest;

        if (num1 > num2 && num1 > num3) {
            largest = num1;
        } else if (num2 > num1 && num2 > num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        System.out.println("Greatest Integer=" + largest);

    }
}