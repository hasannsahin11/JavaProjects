package SaturdayProjects.Week7;

public class Assignment17 {
    public static void main(String[] args) {
        //ta=A and after concat ta become AB
        //tb=C and ta .replace(C,D) does not affect ta cuz  ta= ta.concat("B") does not contain any C or D in it.
        //then ta=ta+tb gives us;
        //     ta=AB+C=ABC
        String ta = "A";
        ta = ta.concat("B");
        String tb = "C";
        ta.replace('C', 'D');
        ta = ta + tb;
        System.out.println(ta);
    }
}
