package clean.code.behavioral.memento;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }
    public Memento deposit(int amount)
    {
        if(amount>0)
        {
            balance+=amount;
        }
        return new Memento(balance);
    }
    public Memento withdraw(int amount)
    {
        if(amount>0 && balance>=amount)
        {
            balance-=amount;
        }
        return new Memento(balance);
    }

    public void restore(Memento m)
    {
        balance=m.getBalance();
    }

    @Override
    public String toString() {
        return "BankAccount : {balance="+balance+"}";
    }
}
