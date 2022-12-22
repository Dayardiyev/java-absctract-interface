package task_2;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(15000);
        CreditAccount creditAccount = new CreditAccount();
        CheckingAccount checkingAccount = new CheckingAccount(20000);

        savingsAccount.transfer(checkingAccount, 1500);
        savingsAccount.addMoney(150);

        creditAccount.pay(250);
        creditAccount.transfer(checkingAccount, 1500);

        checkingAccount.pay(1500);
        checkingAccount.transfer(creditAccount, 150);
    }
}
