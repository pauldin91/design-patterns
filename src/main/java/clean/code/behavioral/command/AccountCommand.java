package clean.code.behavioral.command;

import clean.code.behavioral.command.Action;

public class AccountCommand implements ChainCommand {
    private final int amount;
    private final clean.code.behavioral.command.Action action;
    private boolean succeded;
    private boolean executed;
    private AccountCommand next, prev;
    private Account account;

    public AccountCommand(clean.code.behavioral.command.Action action, int amount) {
        this.action = action;
        this.amount = amount;
    }

    public AccountCommand(Account account, Action action, int amount) {
        this.action = action;
        this.amount = amount;
        this.account = account;

    }

    public AccountCommand add(AccountCommand command) {
        if (next == null) {
            next = command;
            prev = command;
            next.account = prev.account = this.account;
            return this;
        } else {
            command.account = prev.account;
            next.next = command;
            command.prev = next;
            next = command;
        }
        return this;
    }

    @Override
    public void exec() {
        AccountCommand cmd = prev;
        while (cmd != null ) {
            if(!cmd.executed) cmd.ex();
            cmd = cmd.next;
        }
    }

    @Override
    public void undoAll() {
        AccountCommand cmd = next;
        while (cmd != null) {
            if (cmd.executed) cmd.undo();
            cmd = cmd.prev;
        }
    }


    @Override
    public void undoLast() {
        if (next != null && next.prev != null) {
            if (next.executed) {
                next.undo();
            }
        }
    }

    private void ex() {
        switch (action) {
            case DEPOSIT:
                succeded = account.deposit(amount);
                break;
            case WITHDRAW:
                succeded = account.withdraw(amount);
                break;
        }
        executed = true;
    }


    private void undo() {
        if (succeded) {
            switch (action) {
                case DEPOSIT:
                    succeded = account.withdraw(amount);
                    break;
                case WITHDRAW:
                    succeded = account.deposit(amount);
                    break;
            }
            executed = false;
        }
    }

}
