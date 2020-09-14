public class Main {
    public static void main (String[] args) {
        SavingsAccount sam = new SavingsAccount();

        sam.deposits(60000);
        sam.withdrawals(10000);

        System.out.println(sam.getBalance());
        System.out.println(sam.increasedBalance());

        CurrentAccount shane = new CurrentAccount();
        shane.setOverdraftAmount(300);
        shane.setOverdraftChargeIR(12);
        shane.withdrawals(20);

        System.out.println(shane.getBalance());
        System.out.println(shane.updatedBalance());
    }
}
