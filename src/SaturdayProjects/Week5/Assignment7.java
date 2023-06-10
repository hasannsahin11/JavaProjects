package SaturdayProjects.Week5;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.nextLine();
        System.out.println(getMiddleChars(word));
    }

    public static String getMiddleChars(String word) {
        String midThree = "";
        if (word.length() % 2 == 1 && word.length() >= 5) {
            midThree = word.substring(word.length() / 2 - 1, word.length() / 2 + 2);
        } else {
            midThree = "invalid";
        }
        return midThree;
    }
}
