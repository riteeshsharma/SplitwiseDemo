package dev.riteesh.SpltiwiseDemo.commands;

public interface Command {

    boolean matches(String input);

    void execute(String input);
}
