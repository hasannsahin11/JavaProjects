package SaturdayProjects.Week5;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word that you want its last letter: ");
        String word = scan.next();
        System.out.println(getLastWord(word));

    }
    public static char getLastWord(String name){

        char lastLetter =  name.charAt(name.length()-1);
        return lastLetter;
    }

}