package SaturdayProjects.Week4;

import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();

        if (grade<60){
            System.out.println("FAIL!");
        } else if (grade >= 60 && grade < 70){
            System.out.println("Pass.");
        } else if (grade >= 70 && grade < 90){
            System.out.println("Good.");
        } else if (grade >= 90) {
            System.out.println("Excellent!");
        }
    }
}
