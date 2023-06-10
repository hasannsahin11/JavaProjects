package SaturdayProjects.Week5;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an email address: ");
        String email = scan.nextLine();
        System.out.println(getInfo(email));
    }
    public static String getInfo(String email){
        String info = "";
        String firstName = email.substring(0,1).toUpperCase()+email.substring(1,email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("_")+2).toUpperCase() + email.substring(email.indexOf("_")+2,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
        String topLevelDomain = email.substring(email.indexOf(".")+1);
        return info+= "First name: " + firstName+ "\nLast name: " + lastName+ "\nDomain :" + domain+ "\nTop-level domain: " + topLevelDomain;
    }
}
