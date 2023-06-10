package SaturdayProjects.Week3;

public class Assignment03 {
    public static void main(String[] args) {
        /*
        Instruction : Declare a variable account number (String).
        You will check if these account numbers are valid. You should check the variable manually.
        - If the account number begins with a “2” the account number should be 7 characters long
                Print: "Valid 7-digit account number"
                Otherwise: "Invalid 7-digit account number"
        - If the account number begins with a “5” the account number should be 10 characters long
                Print: "Valid 5-digit account number"
                Otherwise: "Invalid 5-digit account number"
        - If the account number does not begin with a “2” or a “5”
                Print: "Invalid account number"
         */

        String accountNum = "2458543";
        boolean isStartWith2 = accountNum.startsWith("2");      //true
        int lengthAccNum = accountNum.length();                 //7

        System.out.println(accountNum + " is a valid 7-digit account number");
        System.out.println("is "+ accountNum + " starting with \"2\" = "+ isStartWith2 );
        System.out.println("The length of the  "+accountNum+ " is : "+ lengthAccNum);




    }
}

