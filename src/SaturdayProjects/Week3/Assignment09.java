package SaturdayProjects.Week3;

public class Assignment09 {
    public static void main(String[] args) {
        String p1firstName = "James";
        String p1lastName = "Bond";
        String p1fullName = p1firstName+p1lastName;

        String p2firstName = "Jamie";
        String p2lastName = "Jones";
        String p2fullName = p2firstName+p2lastName;

        if(p1lastName == p2lastName){
            System.out.println("Related.");
        } else if (p1lastName != p2lastName) {
            System.out.println("Not Related.");

        }


    }
}
