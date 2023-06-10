package SaturdayProjects.Week5;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String text = scan.nextLine();
        System.out.println("Enter you name");
        String name = scan.nextLine();
        System.out.println(getMyName(text,name));;
    }
    public static String getMyName(String text,String name){
        String message = "";
        if (text.contains(name)){
            message = "read this email:";
        } else {
            message = "do not read!";
        }
        return message;
    }
}
