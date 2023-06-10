package SaturdayProjects.Week4;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        if (word1.equals(word2)){
            System.out.println(word1 +  " equals " + word2);
        } else{
            System.out.println("Word1 doesn't equal word2");
        }
    }
}
