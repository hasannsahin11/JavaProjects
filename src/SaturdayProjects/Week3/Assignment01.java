package SaturdayProjects.Week3;

public class Assignment01 {
    public static void main(String[] args) {
        //Longest word contains a
        String s1 = "Java";
        String s2 = "mouse";
        String s3 = "computer";

        int lengthS1 = s1.length();     //4
        int lengthS2 = s2.length();     //5
        int lengthS3 = s3.length();     //8

        boolean s1Has = s1.contains("a");   //true
        boolean s2Has = s2.contains("a");   //false
        boolean s3Has = s3.contains("a");   //false

        System.out.println("\""+ s1 +"\"" + " is the longest word that contains \"a\"");

        System.out.println("The length of " + "\"" + s1 + "\"" + " is "+lengthS1 );

        System.out.println("Does " + "\"" + s1 + "\"" + " contains \"a\" = " +s1Has);


    }

}
