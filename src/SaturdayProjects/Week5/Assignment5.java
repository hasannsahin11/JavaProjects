package SaturdayProjects.Week5;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word that you want to be reversed:");
        String word = scan.nextLine();
        System.out.println(getReversed(word));
    }

    public static String getReversed(String word) {
        String reverse = "";
        for (int i = word.length()-1; i >= 0 ; i--) {
            reverse = reverse + word.charAt(i);
        }
        return reverse;
    }
}