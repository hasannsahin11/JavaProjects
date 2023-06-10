package SaturdayProjects.Week5;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the sentence: ");
        String sentence = scan.nextLine();
        System.out.println("Please enter the search word: ");
        String searchWord = scan.nextLine();
        System.out.println(isContainWord(sentence, searchWord));

    }

    public static boolean isContainWord(String sentence, String searchWord) {
        boolean isContain;
        isContain = sentence.contains(searchWord);
        while (isContain) {
            return true;
        }
        return false;
    }
}


