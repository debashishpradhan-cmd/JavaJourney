package day05_basics;

import java.util.Scanner;

public class StringReverse {

    public static String reverseString(String word) {

        int strLen = word.length();

       String reversedWord = ""; // to be initialized inside for loop

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(strLen - 1);
            reversedWord = reversedWord + ch;
            strLen--;
        }

        return reversedWord;
    }

    public static void main(String[] args) {

        System.out.print("Enter the Word to be reversed: ");
        Scanner sc = new Scanner(System.in);

        String myWord = sc.next();

        String reverseWord = reverseString(myWord);

        System.out.println("The reverse of your word is: " + reverseWord);

        sc.close();
    }
}
