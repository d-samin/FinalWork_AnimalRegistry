package presenter;

import model.*;
import model.Pets.Cat;
import model.Pets.Dog;
import model.Pets.Hamster;
import view.AnimalRegistryView;
import model.Pack_animals.Camel;
import model.Pack_animals.Donkey;
import model.Pack_animals.Horse;

public class AnimalRegistryPresenter {
    private AnimalRegistry model;
    private AnimalRegistryView view;

    public AnimalRegistryPresenter(AnimalRegistry model, AnimalRegistryView view) {
        this.model = model;
        this.view = view;
    }

    public void addAnimal() {
        String name = view.getAnimalNameInput();
        int typeChoice = view.getAnimalTypeInput();
        String birthDate = view.getAnimalBirthDateInput();

        Animal animal;
        switch (typeChoice) {
            case 1 -> {
                int petChoice = view.getPetTypeInput();
                switch (petChoice) {
                    case 1 -> animal = new Dog(AnimalRegistry.getAnimalCount() + 1, name, birthDate);
                    case 2 -> animal = new Cat(AnimalRegistry.getAnimalCount() + 1, name, birthDate);
                    case 3 -> animal = new Hamster(AnimalRegistry.getAnimalCount() + 1, name, birthDate);
                    default -> {
                        view.displayMessage("Неверный выбор типа домашнего животного. Животное не добавлено.");
                        return;
                    }
                }
            }
            case 2 -> {
                int packAnimalChoice = view.getPackAnimalTypeInput();
                switch (packAnimalChoice) {
                    case 1 -> animal = new Horse(AnimalRegistry.getAnimalCount() + 1, name, birthDate);
                    case 2 -> animal = new Camel(AnimalRegistry.getAnimalCount() + 1, name, birthDate);
                    case 3 -> animal = new Donkey(AnimalRegistry.getAnimalCount() + 1, name, birthDate);
                    default -> {
                        view.displayMessage("Неверный выбор типа вьючного животного. Животное не добавлено.");
                        return;
                    }
                }
            }
            default -> {
                view.displayMessage("Неверный выбор типа. Животное не добавлено.");
                return;
            }
        }
        model.addAnimal(animal);
        view.displayMessage("Животное добавлено.");
    }

    public void displayAllAnimals() {
        if (model.getAnimalsByBirthDate().isEmpty()) {
            view.displayMessage("В реестре пока нет животных.");
        } else {
            for (Animal animal : model.getAnimalsByBirthDate()) {
                view.displayMessage(animal.toString());
            }
        }
    }

    public void addCommandToAnimal() {
        int id = view.getAnimalIdInput();
        String command = view.getCommandInput();
        model.addCommand(id, command);
    }

    public void displayCommandsForAnimal() {
        int id = view.getAnimalIdInput();
        var commands = model.getCommands(id);
        if (commands == null || commands.isEmpty()) {
            view.displayMessage("Животное с таким ID не найдено или у него нет команд.");
        } else {
            view.displayMessage("Команды животного: " + String.join(", ", commands));
        }
    }

    public void displayAnimalCount() {
        view.displayMessage("Всего животных в реестре: " + AnimalRegistry.getAnimalCount());
    }
}
