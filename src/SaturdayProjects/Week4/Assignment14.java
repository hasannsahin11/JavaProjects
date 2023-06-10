package SaturdayProjects.Week4;

import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("In : ");
        String name = scan.nextLine();
        if (name.equals("Chen")){
            System.out.println("Teacher");
        }else {
            System.out.println("student");
        }
    }
}
