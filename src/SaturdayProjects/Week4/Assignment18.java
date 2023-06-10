package SaturdayProjects.Week4;

import java.util.Scanner;

public class Assignment18 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println("Enter status code");
        int number = scan.nextInt();

        switch (number) {
            case 200:
                System.out.println("OK");
                break;
            case 201:
                System.out.println("Created");
                break;
            case 202:
                System.out.println("Accepted");
                break;
            case 301:
                System.out.println("Moved permanent");
                break;
            case 303:
                System.out.println("See other");
                break;
            case 304:
                System.out.println("Not Modified");
                break;
            case 307:
                System.out.println("Temporary Redirect");
                break;
            case 400:
                System.out.println("Bad Request");
                break;
            case 401:
                System.out.println("Unauthorized");
                break;
            case 403:
                System.out.println("Forbidden");
                break;
            case 404:
                System.out.println("Not found");
                break;
            case 410:
                System.out.println("Gone");
                break;
            case 500:
                System.out.println("Internal Server Error");
                break;
            case 503:
                System.out.println("Service Unavailable");
                break;
            default:
                System.out.println("Invalid Status code");


        }
    }
}
