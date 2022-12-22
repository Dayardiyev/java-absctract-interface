package task_2;

public class CheckingAccount extends Account {

    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    void pay(int amount) {
        if(amount > balance){
            System.out.println("Эта сумма больше чем сумма на счету");
        } else if (balance < 0 || amount < 0) {
            System.out.println("Ошибка!");
        } else {
            balance -= amount;
            System.out.println(amount + " был списан со счета");
            System.out.println("Ваш баланс: " + balance);
        }
    }

    @Override
    void transfer(Account account, int amount) {
        if(amount > balance){
            System.out.println("Эта сумма больше чем сумма на счету");
        } else if (balance < 0 || amount < 0) {
            System.out.println("Ошибка!");
        } else {
            account.balance += amount;
            balance -= amount;
            System.out.println(amount + " был переведен на счет");
            System.out.println("Ваш баланс: " + balance);
        }
    }

    @Override
    void addMoney(int amount) {
        if (amount < 0 || balance < 0){
            System.out.println("Ошибка!");
        } else {
            balance += amount;
            System.out.println(amount + " был добавлен на этот счет");
            System.out.println("Ваш баланс: " + balance);
        }
    }
}
