package SaturdayProjects.Week6;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sandwich essentials: ");
        String input = scan.nextLine();
        System.out.println(getInBetween(input));
    }

    public static String getInBetween(String input){
        String search = "bread";
        String result = "";
        int count = 0;
        for (int i = 0; i <= input.length()-search.length(); i++) {
            if (input.substring(i,i+search.length()).equals(search)){
                count++;
            }
        }
        if (!input.contains(search)){
            result+="Nothing";
        } else if (count==1) {
            result+="Nothing";
        } else if (input.contains("breadbread")) {
            result += "Nothing";
        }else {

            // breadjambread
            result += input.substring(input.indexOf(search)+search.length(),input.lastIndexOf(search));
        }
        return result;
    }
}
