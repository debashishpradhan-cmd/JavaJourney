package day05_basics;

import java.util.Scanner;

public class VowelCount {

    public static int countVowels(String word) {

        int len = word.length(); // fetch length of the string

        int vowelCount = 0;

        for (int m = 0; m < len; m++) {

            char ch = Character.toLowerCase(word.charAt(m)); // captures upper case vowels also

            //char ch = word.charAt(m); -- captures vowel count only when user input is in lower-case.

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                vowelCount++;
            }
        }
        return vowelCount;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the word to be checked for vowels: ");
        String testWord = sc.next();

        int numVowels = countVowels(testWord);

        System.out.println("Number of vowels in the word is: " + numVowels);

        sc.close();
    }
}
