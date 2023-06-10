package SaturdayProjects.Week4;


import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the farthest planet in the solar system? ");
        System.out.println("a) Venus");
        System.out.println("b) Pluto");
        System.out.println("c) Neptune");

        System.out.println("Enter your password: ");
        String answer = scan.nextLine();


        if (answer.equals("a") || answer.equals("c")){
            System.out.println(answer + " is wrong.");
        } else if (answer.equals("b")){
            System.out.println(answer + " is correct.");
        } else {
            System.out.println(answer + " is not valid answer.");
        }
    }
}