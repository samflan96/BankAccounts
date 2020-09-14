/**
 *  Savings Accounts (Personal Saver)
 * •Should not be able to withdraw more than the balance
 * •Should store an interest rate i.e. 14.5% = 14.5
 * •Should be able to update the balance based on the current interest rate using
 * the following formula: current balance + (current balance * ( interest rate / 100 ))
 * •Should be able to change the value of the interest rate
 * •Should be able to accrue additional funds to be added to the balance based on an interest rate for the account

 */

public class SavingsAccount extends BankAccount {
    double interestRate = 14.5;  // ?? Should be able to change the value of the interest rate

    public double withdrawals ( double amount) {
        if (amount < 0) {
            System.err.println("Withdrawal amount must be greater than $0");

        } else if (amount <= balance ){
            balance -= amount;
        }
        else{
            System.err.println("Insufficient Funds!");
        }
        return balance;
    }

    public double increasedBalance() { // update balance
        if (balance > 0) {
            balance = balance * (1 + (interestRate / 100));
        }
        return balance;
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

}

// should i be able to change the interest rate after it's declared?