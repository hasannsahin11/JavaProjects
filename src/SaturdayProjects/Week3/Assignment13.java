package SaturdayProjects.Week3;

import java.util.Locale;
import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String name = scan.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scan.nextLine();

        String ID = name.substring(0,1).toLowerCase() + lastName.substring(0,1).toUpperCase(Locale.ROOT) + lastName.substring(1,3) + name.length()*2;
        System.out.println(ID);
    }
}
