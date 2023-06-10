package SaturdayProjects.Week9.bankingApp.Accounts;

public class Credit extends Account {
    /* This class inherits from Account class. It has private double creditLimit and private double transactionFee variables.
     * Create a constructor with creditLimit parameter. Pass "credit" value to the super. assign creditLimit coming from the constructor to the creditLimit variable
     * and set the transactionFee to %3
     *
     * Implement all necessary methods.
     *
     * In addMoney method decrease the amount by %transactionFee and add it to the balance if the amount is equal or bigger than 0,
     * otherwise print "You cannot add negative amount".
     *
     * In withdrawMoney method decrease balance by amount and %transactionFee of the amount if balance is equal or greater than the total amount,
     * otherwise print "Insufficient balance"
     * */
    private double creditLimit;
    private double transactionFee;

    public Credit(double creditLimit) {
        super("Credit");
        this.creditLimit = creditLimit;
        this.transactionFee = 0.03;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    @Override
    public void addMoney(double amount) {
        if (amount >= 0) {
            double balance = getBalance();
            balance = balance + (amount - amount * transactionFee);
            setBalance(balance);
        } else {
            System.out.println("You cannot add negative amount");
        }
    }

    @Override
    public void withdrawMoney(double amount) {
        double balance = getBalance();
        double totalAmount = amount + (amount * transactionFee);
        if (balance+creditLimit >= totalAmount) {
            balance = balance - totalAmount;
            setBalance(balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
