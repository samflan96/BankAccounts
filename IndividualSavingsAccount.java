/**
 *
 ISA (Personal Saver)
 •	Should not be able to withdraw more than the balance
 •	Should store an interest rate that is constant for all ISAs i.e. 14.5% = 14.5
 •	Should be able to change the value of the interest rate
 •	Should be able to update the balance based on the current interest rate using the following formula: current balance + (current balance * ( interest rate / 100 ))
 •	Should be able to accrue additional funds to be added to the balance based on an interest rate for the account

 */

public class IndividualSavingsAccount extends BankAccount {
    private double currentInterestRate = 14.5; // default until set another

    private double changeInterestRate(double currentInterestRate){
        this.currentInterestRate = currentInterestRate;
        return currentInterestRate;
    }

    // when to use override???
    @Override
    public double withdrawals(double amount) {
        if (amount < balance){
            System.err.println("Withdrawal amount is greater than the balance! Please try again");
        } else if (amount < 0){
            System.err.println("Withdrawal amount less than $0"); // ???
        } else{
            balance -= amount;
        }
        return balance;
    }

    public double updatedBalance() {
        balance = balance + (balance * (currentInterestRate/100));
        return balance;
    }
}