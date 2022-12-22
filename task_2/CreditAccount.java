package task_2;

public class CreditAccount extends Account{

    public CreditAccount() {
        super(0);
    }

    @Override
    void pay(int amount) {
        if (amount < 0 || balance > 0){
            System.out.println("Ошибка!");
        } else {
            balance -= amount;
            System.out.println(amount + " был списан со счета");
            System.out.println("Ваш баланс: " + balance);
        }
    }

    @Override
    void transfer(Account account, int amount) {
        System.out.println("Со счета нельзя переводить");
    }

    @Override
    void addMoney(int amount) {
        int total = balance += amount;
        if (total > 0) {
            System.out.println("Кредитный счет не может выйти в положительный баланс");
        } else if (amount < 0 || balance >= 0) {
            System.out.println("Ошибка!");
        } else {
            balance -= amount;
            System.out.println(amount + " был добавлен на ваш счет");
            System.out.println("Ваш баланс: " + balance);
        }
    }
}
