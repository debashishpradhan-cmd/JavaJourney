package day04_basics;

public class AddNum {//this class file adds two static numbers fed from the main method.

    public static int addition(int a, int b) {//define the 'addition' method

        return a + b;
    }


    public static void main(String[] args) {

        int finalNum = addition(24, 43);

        System.out.println("The final result is: " + finalNum);
    }
}
