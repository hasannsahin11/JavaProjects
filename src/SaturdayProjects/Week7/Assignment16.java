package SaturdayProjects.Week7;

public class Assignment16 {
    public static void main(String[] args) {
        //System.out.println(num); on this stage num did not update.
        //and it gives us 10 . if we would like to add 10 to num we have to put sout under the method
        int num = 10;
        add10(num);
        System.out.println(num);
    }

    static void add10(int num) {
        num = num + 10;
    }
}