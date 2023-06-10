package SaturdayProjects.Week7;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        System.out.println(getWords());
    }

    public static String getWords() {
        String result = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you array: ");
        String sentence = scan.nextLine();
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            result += words[i].substring(0, 1).toUpperCase() + words[i].substring(1) + " ";
        }

        return result;
    }

}



