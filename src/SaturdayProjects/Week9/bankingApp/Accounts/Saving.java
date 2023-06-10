package SaturdayProjects.Week9.bankingApp.Accounts;

public class Saving extends Account {
    /* This class inherits from Account class. It has extra private double interestRate variable.
     * Create a constructor without any variables. Pass "saving" string to super constructor.
     * assign %1.5 to interest rate in the constructor.
     *
     * Implement necessary methods.
     *
     * In addMoney method add amount to balance variable if it is equal or greater than 0, otherwise print "You cannot add negative amount"
     *
     * In withdrawMoney method subtract amount plus a fee of 0.01 of the amount from balance if the balance is bigger than total amount, otherwise
     * print "Insufficient balance"
     *
     * There is another method in this class, name applyInterest. In applyInterest method increase the balance by interestRate times itself.
     *
     * */
    private double interestRate;

    public Saving() {
        super("Saving");
        this.interestRate = 0.015;
    }
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void addMoney(double amount) {
        if (amount >= 0) {
            setBalance(getBalance() + amount);
            System.out.println("This is how much you added: " + amount);
        } else {
            System.out.println("You can not add negative amount");
        }

    }

    @Override
    public void withdrawMoney(double amount) {
        double balance = getBalance();
        double totalAmount = amount + (amount * 0.01);
        if (balance >= totalAmount) {
            balance = balance - totalAmount;
            setBalance(balance);
        } else {
            System.out.println("Insufficient balance");
        }

    }

    public void applyInterest() {
        double balance = getBalance();
        balance = balance + balance*getInterestRate();
        setBalance(balance);
    }
}
