package model;

import java.util.List;

public interface IAnimal {
    void getId();
    void getName();
    void getBirthDate();
    List<String> getCommands();
    void addCommand(String command);
}
