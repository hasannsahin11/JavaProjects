package SaturdayProjects.Week6;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the html variable: ");
        String input = scan.nextLine();
        System.out.println(getId(input));

        // <!DOCTYPE html> <html> <head> <title> Java < /title> < /head> <body> <p id= “myid”> </p> </body> </html>
    }
    public static String getId(String input){
        String search = "myid";
        String id = input.substring(input.indexOf(search),input.indexOf(search)+search.length());
        if (input.contains("<html>")){
        }else{
            System.out.println("Invalid input.");
        }
      return id;
    }

}
