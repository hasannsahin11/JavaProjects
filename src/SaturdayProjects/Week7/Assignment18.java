package SaturdayProjects.Week7;

public class Assignment18 {
    public static void main(String[] args) {
        //boolean b1=str1==str3;string value con not write like that.(int value
        //therefore it gives us default value that is false
        //b2 is okay for the String statement
        String str1 = "Java";
        String[] str2 = {"J", "a", "v", "a"};
        String str3 = "";
        for (int i = 0; i <str2.length ; i++) {
            str3+=str2[i];

        }
        boolean b1=str1==str3;
        boolean b2=str1.equals(str3);
        System.out.println(b1+ " "+b2);
    }
}