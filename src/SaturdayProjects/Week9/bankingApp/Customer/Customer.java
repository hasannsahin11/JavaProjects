package SaturdayProjects.Week9.bankingApp.Customer;

import SaturdayProjects.Week9.bankingApp.Accounts.Account;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
    /* This class is an abstract class.
     * Create the fields below and their getters and setters
     *
     * private String customerNumber;
     * private String customerName;
     * private double creditLimit;
     * private List<Account> accounts
     *
     * Create a constructor with customerName parameter and assign it to customerName variable.
     *
     * Assign a random number between 1000000-10000000 to customerNumber.
     * Create this number in setCustomerNumber method and return the number. Assign it to customerNumber in the constructor by
     * calling setCustomerNumber method.
     *
     * Initialize accounts list as an ArrayList in the constructor.
     *
     * Create an abstract openAccount method with a String accountType parameter.
     *
     * Create a non-abstract deleteAccount method with an Account parameter.
     * Delete this account from accounts list if its balance is 0.
     * If the balance is negative print "You cannot close credit account without paying your debt"
     * If the balance is positive print "You have $balance in your account. Withdraw your money first"
     *
     *
     *
     */
    private String customerNumber;
    private String customerName;
    protected double creditLimit;
    private List<Account> accounts;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.customerNumber = setCustomerNumber();
        this.accounts = new ArrayList<>();
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String setCustomerNumber() {
        int accountNumber = (int) (Math.random() * ((10000000 - 1000000) + 1)) + 1000000;
        return Integer.toString(accountNumber);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts, String accountType) {
        if (accountType.equals("checking")) {

        }
    }

    public abstract Account openAccount(String accountType);

    public void deleteAccount(Account accountType) {
        if (accountType.getBalance() == 0) {
            accounts.remove(accountType);
            System.out.println("Balance is zero; this account has been removed from the accounts list.");
        } else if (accountType.getBalance() < 0) {
            System.out.println("You can not close credit account without paying your debt");
        } else if (accountType.getBalance() > 0) {
            System.out.println("You have $" + accountType.getBalance() + " in your account. Withdraw your money first!");
        }
    }

}
