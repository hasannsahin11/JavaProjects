package SaturdayProjects.Week5;

import java.util.Scanner;

public class Assignment18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 words:");
        String a = scan.nextLine(), b = scan.nextLine();
        getLongestWord(a, b);
    }

    private static String getLongestWord(String a, String b) {
        String newWord = a.length() > b.length() ? a : b;
        return newWord;
    }

}

