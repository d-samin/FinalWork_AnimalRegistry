package model;

import java.util.List;

public class AnimalsServer {
    private AnimalRegistry animals;

    public AnimalsServer(AnimalRegistry animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal) {
        animals.addAnimal(animal);
        System.out.println("Добавлено новое животное: " + animal.getName());
    }

    public List<Animal> getAnimalsByBirthDate() {
        return animals.getAnimalsByBirthDate();
    }

    public static int getAnimalCount() {
        return AnimalRegistry.getAnimalCount();
    }

    public void addCommand(int animalId, String command) {
        animals.addCommand(animalId, command);
    }

    public List<String> getCommands(int animalId) {
        return animals.getCommands(animalId);
    }
}

