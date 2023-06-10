package SaturdayProjects.Week6;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String w1 = scan.nextLine();
        System.out.println(getVowels(w1));
    }

    public static String getVowels(String w1) {
        String vowels = "";
        for (int i = 0; i < w1.length(); i++) {
            if (w1.charAt(i) == 'a' || w1.charAt(i) == 'e' || w1.charAt(i) == 'i' || w1.charAt(i) == 'o' || w1.charAt(i) == 'u') {
                System.out.print(w1.charAt(i));
            }
        }
       return vowels;
    }
}
