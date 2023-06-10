package SaturdayProjects.Week5;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two 3 digit words:");
        String word1 = scan.next();
        System.out.println("Enter two 3 digit 2nd word:");
        String word2 = scan.next();

        System.out.println(getMergedWord(word1, word2));
    }

    public static String getMergedWord(String word1, String word2) {
        String merge = "";
        if (word1.length()==3 && word2.length()==3){
            merge = merge+word1.charAt(0)+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+word1.charAt(2)+word2.charAt(2);
        } else{
            merge = "can not merge";
        }
        return merge;
    }
}
