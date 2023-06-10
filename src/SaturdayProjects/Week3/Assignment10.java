package SaturdayProjects.Week3;

public class Assignment10 {
    public static void main(String[] args) {
        String given = "Sender: <James>.From Number: [202-123-3456]. + Message: {I love programming and problem solving}";
        String actualSender = given.substring(9,14);
        System.out.println(actualSender);
        String actualNumber = given.substring(29,43);
        System.out.println(actualNumber);
        String actualMessage = given.substring(57,95);
        System.out.println(actualMessage);
        System.out.println("Actual sender: " + " " +actualSender +  " Actual number: " + actualNumber + "Actual message : " + actualMessage);
    }
}
