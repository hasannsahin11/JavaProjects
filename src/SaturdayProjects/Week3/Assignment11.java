package SaturdayProjects.Week3;

import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        Scanner st1 = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String string1 = st1.next();
        Scanner st2 = new Scanner(System.in);
        System.out.println("Enter your last name: ");
        String string2 = st2.next();
        String string3 = "@gmail.com";

        if ((string1.length()<6) || string2.length()<6){
            System.out.println("Invalid data!");
        }else if ((string1.length()>=6) || string2.length()>=6)
            System.out.println(string1.substring(0, 4) + string2.substring(string2.length() - 3) + string3);
    }
}
