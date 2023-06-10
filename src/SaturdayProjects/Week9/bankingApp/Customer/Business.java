package SaturdayProjects.Week9.bankingApp.Customer;

import SaturdayProjects.Week9.bankingApp.Accounts.Account;
import SaturdayProjects.Week9.bankingApp.Accounts.Checking;
import SaturdayProjects.Week9.bankingApp.Accounts.Credit;

import java.util.List;

public class Business extends Customer{
    /* This class inherits from Customer class. It has private int annualIncome variable.
     * Create a constructor with parameters String customerName and int annualNetIncome.
     * Assign annualIncome to annualIncome.
     *
     * Create a setCreditLimit method with an int annualIncome parameter. Return type is double.
     * Set creditLimit to %30 of annualIncome setCreditLimit and assign it to creditLimit variable in the constructor.
     *
     * Implement all necessary methods.
     *
     * In openAccount method
     *           if accountType is checking, create a checking account and add it to the accounts list.
     *           if accountType is saving, print "Business customers cannot have saving accounts"
     *           if accountType is credit, create a credit account and add it to the accounts list.
     */
    private int annualIncome;

    public Business(String customerName, int annualIncome) {
        super(customerName);
        this.annualIncome = annualIncome;
        this.creditLimit = setCreditLimit(annualIncome);
    }

    @Override
    public Account openAccount(String accountType) {

        Account account;
        if (accountType.equals("checking")) {
            account = new Checking();
            getAccounts().add(account);
        } else if (accountType.equals("saving")) {
            System.out.println("Business customers cannot have saving accounts");
            account = null;

        } else if (accountType.equals("credit")) {
            account = new Credit(creditLimit);
            getAccounts().add(account);
        } else {
            account = null;
            System.out.println("Invalid account type");
        }
        return account;
    }

    public double setCreditLimit(int annualIncome){
        double creditLimit = annualIncome*0.30;
        return creditLimit;
    }
}
