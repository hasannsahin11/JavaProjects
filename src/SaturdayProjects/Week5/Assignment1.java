package SaturdayProjects.Week5;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a number: ");
        int number = scan.nextInt();
        System.out.println(Assignment1.getDay(number));
    }
    private static String getDay (int number){
        String day;
        switch (number) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day ="No such day is available.";
        }
         return day;
    }
}