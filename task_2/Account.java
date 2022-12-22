package task_2;

public abstract class Account {
    int balance;

    public Account(int balance){
        this.balance = balance;
    }

    abstract void pay(int amount);
    abstract void transfer(Account account, int amount);
    abstract void addMoney(int amount);
}
