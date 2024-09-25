package clean.code.behavioral.command;

public class Account {
    private int balance;

    public boolean deposit(int amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Deposit amount: "+amount);
            System.out.println("Balance is: "+balance);
            return true;
        }
        return false;
    }
    public boolean withdraw(int amount)
    {
        if(amount>0 && balance>=amount)
        {
            balance-=amount;
            System.out.println("Withdrawal amount: "+amount);
            System.out.println("Balance is: "+balance);
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "balance="+balance;
    }
}
