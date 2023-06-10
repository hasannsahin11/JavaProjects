package SaturdayProjects.Week6;

import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements? ");
        int length = scan.nextInt();
        String[] words = new String[length];
        System.out.println(getPairs(words));
    }

    public static String getPairs(String[] words) {
        String output = "";
        for (int i = 0; i < words.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Words: ");
            words[i] = scan.nextLine();

        }
        for (int j = 0; j < words.length; j += 2) {
            output += words[j] + ", " + words[j + 1] + "\n";

        }
        return output;
    }

}
