package SaturdayProjects.Week3;

public class Assignment04 {
    public static void main(String[] args) {
        String message = "What the heck assignment 3";
        String badWord1 = "idiot";
        String badWord2 = "dumb";
        String badWord3 = "heck";
        if (message.contains(badWord1) || message.contains(badWord2) || message.contains(badWord3)){
            System.out.println("Message not sent!");
        }else{
            System.out.println(message);
        }
    }
}
