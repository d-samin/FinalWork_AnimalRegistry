package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private int id;
    private String name;
    private String birthDate;
    private String type;
    private List<String> commands; 

    public Animal(int id, String name, String birthDate, String type) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.type = type;
        this.commands = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public String getBirthDate() {
        return birthDate;
    }  

    public List<String> getCommands() {
        return commands;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Имя: " + name + ", Дата рождения: " + birthDate +
               ", Тип: " + type + ", Команды: " + commands;
    }
}
