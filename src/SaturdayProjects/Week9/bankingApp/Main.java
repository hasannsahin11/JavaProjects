package SaturdayProjects.Week9.bankingApp;

import SaturdayProjects.Week9.bankingApp.Accounts.Account;
import SaturdayProjects.Week9.bankingApp.Accounts.Checking;
import SaturdayProjects.Week9.bankingApp.Accounts.Saving;
import SaturdayProjects.Week9.bankingApp.Customer.Business;
import SaturdayProjects.Week9.bankingApp.Customer.Customer;
import SaturdayProjects.Week9.bankingApp.Customer.Personal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Techno Bank");
        // new Personal("Jason", 120000)
        Personal person1 = new Personal("Jason", 120000);
        /* Create a checking account for Jason and deposit $200 and withdraw $50. Check the balance. It must be $150
         * Withdraw $150 and then try to delete this account. You must see the success message
         * Create a saving account for this customer, deposit $200, withdraw $50 and apply interest. Check the balance. It must be $151.7425
         * Try to delete this account. You must see "You have $151.7425 in your account. Withdraw your money first"
         * Create a credit account for this customer, deposit $200, withdraw $50. Check the balance. It must be $142.5
         * Withdraw $200 and try to delete this account. You must see "You cannot close credit account without paying your debt" message
         * Try to delete this customer. You must see "This customer has either money or debt in one of his/her accounts." message
         */


//     Create a checking account for Jason and deposit $200 and withdraw $50. Check the balance. It must be $150
       bank.addCustomer(person1);
       Account checkingAcc = person1.openAccount("checking");
       checkingAcc.addMoney(200);
       checkingAcc.withdrawMoney(50);
       System.out.println(checkingAcc.getBalance());
//     Withdraw $150 and then try to delete this account. You must see the success message
       checkingAcc.withdrawMoney(150.0);
       System.out.println(checkingAcc.getBalance());
       person1.deleteAccount(checkingAcc);

//      Create a saving account for this customer, deposit $200, withdraw $50 and apply interest.
       Account savingAcc = person1.openAccount("saving");
       savingAcc.addMoney(200);
       savingAcc.withdrawMoney(50);
       System.out.println(savingAcc.getBalance());
        if(savingAcc instanceof Saving) {
            ((Saving) savingAcc).applyInterest();}
//      Check the balance. It must be $151.7425
        System.out.println(savingAcc.getBalance());
//      Try to delete this account. You must see "You have $151.7425 in your account. Withdraw your money first"
        person1.deleteAccount(savingAcc);

//      Create a checking account for this customer, deposit $200, withdraw $50. Check the balance. It must be $142.5
        Account creditAcc = person1.openAccount("credit");
        creditAcc.addMoney(200);
        creditAcc.withdrawMoney(50);
        System.out.println(creditAcc.getBalance());
//      Withdraw $200 and try to delete this account. You must see "You cannot close credit account without paying your debt" message
        creditAcc.withdrawMoney(200.0);
        System.out.println(creditAcc.getBalance());
        person1.deleteAccount(creditAcc);


//     Try to delete this customer. You must see "This customer has either money or debt in one of his/her accounts." message
      bank.deleteCustomer(person1);


        /* bank.addCustomer(new Business("Google",50000000));
         * Create a checking account for Google. Deposit $200 and withdraw $200. Try to delete this customer.
         * You must see "Customer has been deleted successfully" message
         */

//        Create a checking account for Google. Deposit $200 and withdraw $200. Try to delete this customer.
        Business business = new Business("Google",50000000);
        Account businessAcc = business.openAccount("checking");
        businessAcc.addMoney(200);
        businessAcc.withdrawMoney(200);
        System.out.println(businessAcc.getBalance());
        bank.deleteCustomer(business);
    }
}
