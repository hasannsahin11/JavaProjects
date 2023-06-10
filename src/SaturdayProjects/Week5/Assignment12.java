package SaturdayProjects.Week5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Assignment12 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(getGuestList());

    }

    public static String getGuestList() {
        String answer = "";
        String guestList = "";
        do {
            System.out.println("Enter a new guest name: ");
            String name = scan.nextLine();
            guestList += name;
            System.out.println("Do you want to enter a new guest name? Yes/No?");
            answer = scan.nextLine();
            if (answer.equals("Yes")) {
                guestList += ",";
            }

        } while (answer.equals("Yes"));
        return guestList;
    }
}