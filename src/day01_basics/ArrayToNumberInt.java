package day01_basics;

public class ArrayToNumberInt {
    public static void main(String[] args) {
        int[] myArray = {4, 7, 6, 1, 2};
        int myNum = 0;

        for (int i = 0; i < myArray.length; i++)
            myNum = myNum * 10 + myArray[i]; // converting the array myArray into an integer myNum.

        System.out.println(myNum);
    }
}
//Here we are storing the final output 47612 as an integer (myNum) and not as a String.
//Hence it can be used later mathematically (as it is an integer and not a String).