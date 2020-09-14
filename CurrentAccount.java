/**
 *
 Current Accounts
 • Should store an overdraft amount up to £2,500
 •	Should allow the overdraft amount to be set upon creation of the account
 •	Should allow withdrawal up to the value of the overdraft amount
 •	Should store an overdraft charges interest rate i.e. 14.5% = 14.5
 •	Should store the overdraft charges interest rate to be set upon the creation of the account
 •	Should be able to update the balance with the overdraft charges.
 The overdraft charges should be calculated using the following formula: amount of overdraft used * ( interest rate / 100 )
 •	Should be able to change the value of the overdraft charges interest rate
 •	Should be able to create a current account without an overdraft amount and interest charge rate
 i.e. if one is not included, the other should not be included. In this scenario, both values should default to 0
 */   // last line is not implemented

public class CurrentAccount extends BankAccount {
    private double OA;
    double overdraftChargeIR = 14.5;  // should this change?
    double overdraftCharge;
    // store overdraft amount up to 2,500??? here?

    public double overdraftAmount(double amount) {
        if (amount <= 2500 && amount >= 0) {
            OA = amount;
        } else {
            System.err.println("Exceeded overdraft limit!");
        }
        return OA; // not sure
    }

    public void setOverdraftAmount(double overdraftAmount){
        this.OA = overdraftAmount;
    }

    public void setOverdraftChargeIR(double overdraftChargeIR){
        this.overdraftChargeIR = overdraftChargeIR;
    }

    public double withdrawals(double amount){
        if(amount > 2500){
            System.err.println("Withdrawal amount is greater than overdraft limit!");
        } else if (amount < 0){
            System.err.println("Withdrawal amount less than $0"); // ???
        } else{
            balance -= amount;
        }
        return balance;

    }
    public double updatedBalance() {
        if (balance > 0) {
            overdraftCharge = OA * (overdraftChargeIR / 100);
            balance += overdraftCharge;
        }
        return balance;
    }
}
