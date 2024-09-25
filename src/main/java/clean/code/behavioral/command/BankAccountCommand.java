package clean.code.behavioral.command;

public class BankAccountCommand implements Command {

    private final BankAccount account;
    private final int amount;
    private final Action action;
    private boolean succeded;

    public BankAccountCommand(BankAccount account, int amount, Action action) {
        this.account = account;
        this.amount = amount;
        this.action = action;
    }

    @Override
    public void call() {
        switch (action) {
            case DEPOSIT:
                succeded= true;
                account.deposit(amount);
                break;
            case WITHDRAW:
                succeded = account.withdraw(amount);
                break;
        }
    }

    @Override
    public void undo() {
        if(!succeded) return;
        switch (action) {
            case DEPOSIT:
                succeded = account.withdraw(amount);
                break;
            case WITHDRAW:
                account.deposit(amount);
                break;
        }
    }
}
