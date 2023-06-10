package SaturdayProjects.Week6;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the JSON variable: ");
        String input = scan.nextLine();
        System.out.println(getName(input));

        // {“id”: 1934, “firstName”: “James”, “lastName”: “May” }
    }
    public static String getName(String input){
       String search1 = "James";
       String search2 = "May";
       String firstName = input.substring(input.indexOf(search1),input.indexOf(search1)+search1.length());
       String lastName = input.substring(input.indexOf(search2),input.indexOf(search2)+search2.length());
       String result = "First name: " + firstName + "\nLast name: " + lastName;

       return result;
    }
}
