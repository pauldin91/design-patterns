package clean.code.behavioral.command;

public class BankAccount {
    private int balance;

    public void deposit(int amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Deposit amount: "+amount);
            System.out.println("Balance is: "+balance);
            return;
        }
        System.out.println("Invalid amount");
    }
    public boolean withdraw(int amount)
    {
        if(amount<=balance && amount>0)
        {
            balance-=amount;
            System.out.println("Withdrawal amount: "+amount);
            System.out.println("Balance is: "+balance);
            return true;
        }
        System.out.println("Insufficient amount");
        return false;
    }

    @Override
    public String toString() {
        return "balance="+balance;
    }
}
