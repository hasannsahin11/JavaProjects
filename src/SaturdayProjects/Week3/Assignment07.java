package SaturdayProjects.Week3;

public class Assignment07 {
    public static void main(String[] args) {
        String str1 = "elephant";
        if (str1.length() % 2 == 0) {
            System.out.println(str1.substring(2, 4));
        } else if (str1.length() % 2 == 1) {
            System.out.println(str1.substring(4, 5));
        }
    }
}
