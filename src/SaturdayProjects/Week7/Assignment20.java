package SaturdayProjects.Week7;

public class Assignment20 {
    public static void main(String[] args) {
        //str.trim() did not assign it,therefore str can not be trimmed.
        //then str.indexOf(" ")assigned to z and z gives us after (" ") length.
        //so let s count
        // ((" ")world)
        //    0  12345 =======5
        String str="Hello World";
        str.trim();
        int z=str.indexOf(" ");
        System.out.println(z);


    }
}
