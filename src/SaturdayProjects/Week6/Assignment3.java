package SaturdayProjects.Week6;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter java python sentence: ");
        String input = scan.nextLine();
        System.out.println(isEqual(input));
    }
    public static boolean isEqual(String input){
        boolean isEqual = true;
        int numberOfJava = 0;
        int numberOfPython = 0;
        String word1 = "java";
        String word2 = "python";
        for (int i = 0; i <= input.length()-word1.length() ; i++) {
            if (word1.equals(input.substring(i,i+word1.length()))){
                numberOfJava++;
            }
        }
        for (int i = 0; i <= input.length()-word2.length(); i++) {
            if (word2.equals(input.substring(i,i+word2.length()))){
                numberOfPython++;
            }
        }
        if (numberOfPython==numberOfJava){
            isEqual = true;
        } else {
            isEqual=false;
        }
        return isEqual;
    }
}
