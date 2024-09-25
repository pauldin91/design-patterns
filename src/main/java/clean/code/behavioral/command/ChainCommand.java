package clean.code.behavioral.command;

public interface ChainCommand {
    void exec();
    void undoLast();
    void undoAll();
}
