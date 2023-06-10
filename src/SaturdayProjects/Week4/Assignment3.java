package SaturdayProjects.Week4;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter current count of seniorCitizen and nonSeniorCitizen");
        int senior= scan.nextInt();
        int nonSenior = scan.nextInt();
        System.out.println("enter new citizenAge");
        int age = scan.nextInt();
        if(age>=65){
            senior++;
            System.out.println("Senior Citizen");
        }else {
            nonSenior++;
            System.out.println("Non-Senior Citizen");
        }
        System.out.println("New senior citizen count : " + senior);
        System.out.println("New nonSeniorCitizen count: " + nonSenior);
    }
}
