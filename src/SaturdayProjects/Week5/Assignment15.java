package SaturdayProjects.Week5;

import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String word1 = scan.nextLine();
        System.out.println(getFirstAndLast(word1));

    }
    public static String getFirstAndLast(String word1){
        String firstAndLast = word1.charAt(0)+ "" +word1.charAt(word1.length()-1);
        return firstAndLast;
    }
}
