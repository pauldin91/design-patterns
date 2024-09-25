package behavioral;

import clean.code.behavioral.command.*;

import org.junit.jupiter.api.Test;

import java.util.List;


public class CommandTests {

    @Test
    public void basicAccountTests()
    {
        BankAccount bankAccount = new BankAccount();
        List<BankAccountCommand> bankAccountCommands = List.of(
                new BankAccountCommand(bankAccount,100, Action.DEPOSIT ),
                new BankAccountCommand(bankAccount,1000, Action.WITHDRAW ),
                new BankAccountCommand(bankAccount,10, Action.WITHDRAW));

        for (BankAccountCommand command:bankAccountCommands)
            command.call();

        for (BankAccountCommand command:bankAccountCommands.reversed())
            command.undo();
    }

    @Test
    public void commandTests()
    {
        Account bankAccount = new Account();
        AccountCommand command = new AccountCommand(bankAccount,Action.DEPOSIT,1000);
        command
                .add(new AccountCommand(Action.WITHDRAW,10))
                .add(new AccountCommand(Action.DEPOSIT,100))
                .add(new AccountCommand(Action.WITHDRAW,10000))
                .add(new AccountCommand(Action.WITHDRAW,10))
                .add(new AccountCommand(Action.DEPOSIT,10));
        command.exec();
        command.undoAll();
        command.undoAll();
        command.exec();
        command.undoAll();
    }
}
