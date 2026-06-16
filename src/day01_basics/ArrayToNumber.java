package day01_basics;

public class ArrayToNumber { // This program will print the array elements as a single number (string)
    public static void main(String[] args) {

        int[] myNum = {5,3,7,2,6};

        for (int i = 0; i < myNum.length; i++){
            System.out.print(myNum[i]);
        }
    }
}

//Please note that here we are just printing the number. We are not storing it anywhere.
// Hence the number cannot be used further.