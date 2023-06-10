package SaturdayProjects.Week3;

import java.util.Scanner;

public class Assignment02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your address :");
        String address = scan.nextLine();

        if(address.isEmpty()){
            System.out.println("No address found");
        }
        System.out.println(address.toUpperCase());
    }
}
