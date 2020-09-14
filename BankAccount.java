public abstract class BankAccount {
    protected double balance;
    private int sortCode; //only 6 digits
    protected int accountNumber; //only 8 digits
    protected int uniqueId; //automatically defined and never modified
    protected String firstName;
    protected String lastName;

    private static int LATEST_ACCOUNT_NUMBER = 10050000;
    private static int LATEST_UNIQUE_ID = 2000007; // 2000007000000

    BankAccount() { // should take in first_name, last_name,and return first name, last name and uniqueID ?
        this.accountNumber = LATEST_ACCOUNT_NUMBER;
        this.uniqueId = LATEST_UNIQUE_ID;

        LATEST_ACCOUNT_NUMBER += 5;
        LATEST_UNIQUE_ID += 7;

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public double deposits (double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.err.println("Deposit amount must be greater than $0");
        }
        return balance;
    }

    public abstract double withdrawals ( double amount);

    public double getBalance () {
        return this.balance;
    }
}





