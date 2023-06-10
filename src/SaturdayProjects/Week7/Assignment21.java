package SaturdayProjects.Week7;

public class Assignment21 {
    public static void main(String[] args) {
        //if we use EQUAL,it is case-sensitive
        //java and Java they are not same strings.first letter should be capital or lowercase  on both.
        String str1 = "Java";
        String str2 = new String("java");
        if (str1.equals(str2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }


    }
}
