package SaturdayProjects.Week4;

import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if (year > 1994 && year < 1999 || year>2000 && year<2003 || year>2003 && year<2007 || year>2014 && year<2018){
            System.out.println("Your vehicle needs to be recalled!");
        } else {
            System.out.println("Your vehicle is fine, enjoy!");
        }
    }
}
