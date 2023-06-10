package SaturdayProjects.Week9.bankingApp.Customer;

import SaturdayProjects.Week9.bankingApp.Accounts.Account;
import SaturdayProjects.Week9.bankingApp.Accounts.Checking;
import SaturdayProjects.Week9.bankingApp.Accounts.Credit;
import SaturdayProjects.Week9.bankingApp.Accounts.Saving;

public class Personal extends Customer {
    /* This class inherits from Customer class. It has private int annualSalary variable.
     * Create a constructor with parameters String customerName and int annualSalary.
     * Assign annualSalary to annualSalary.
     *
     * Create a setCreditLimit method with an int annualSalary parameter. Return type is double.
     * Set creditLimit to  %10 of annualSalary in setCreditLimit and assign it to creditLimit variable in the constructor.
     *
     * Implement all necessary methods.
     *
     * In openAccount method
     *           if accountType is checking, create a checking account and add it to the accounts list.
     *           if accountType is saving, create a saving account and add it to the accounts list.
     *           if accountType is credit, create a credit account and add it to the accounts list.
     */

    private int annualSalary;

    public Personal(String customerName, int annualSalary) {
        super(customerName);
        this.annualSalary = annualSalary;
        this.creditLimit = setCreditLimit(annualSalary);
    }

    public double setCreditLimit(int annualSalary) {
        double creditLimit = annualSalary * 0.1;
        return creditLimit;
    }

    @Override
    public Account openAccount(String accountType) {
        Account account;
        if (accountType.equals("checking")) {
            account = new Checking();
            getAccounts().add(account);

        } else if (accountType.equals("saving")) {
            account = new Saving();
            getAccounts().add(account);


        } else if (accountType.equals("credit")) {
            account = new Credit(getCreditLimit());
            getAccounts().add(account);
        } else {
            account = null;
            System.out.println("Invalid account type");
        }
        return account;
    }

}