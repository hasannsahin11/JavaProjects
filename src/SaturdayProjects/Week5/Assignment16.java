package SaturdayProjects.Week5;

import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first letter: ");
        String l1 = scan.nextLine();
        System.out.println("Enter the second letter: ");
        String l2 = scan.nextLine();
        getLetters(l1, l2);

    }

    public static char getLetters(String l1, String l2) {
        char i;
        for (i = l1.charAt(0); i <= l2.charAt(0); i++) {
            System.out.print(i + ",");

        }
        return i;
    }
}
