package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnimalRegistry {
    private List<Animal> animals;
    private static int animalCount = 0; 

    public AnimalRegistry() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        animalCount++; 
    }

    public List<Animal> getAnimalsByBirthDate() {
        animals.sort(Comparator.comparing(Animal::getBirthDate));
        return animals;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public void printAllAnimals() {
        if (animals.isEmpty()) {
            System.out.println("В реестре пока нет животных.");
        } else {
            for (Animal animal : animals) {
                System.out.println(animal);
            }
        }
    }

    public void addCommand(int animalId, String command) {
        for (Animal animal : animals) {
            if (animal.getId() == animalId) {
                animal.addCommand(command);
                System.out.println("Животное " + animal.getName() + " научилось команде: " + command);
                return;
            }
        }
        System.out.println("Животное с ID " + animalId + " не найдено.");
    }

    public List<String> getCommands(int animalId) {
        for (Animal animal : animals) {
            if (animal.getId() == animalId) {
                return animal.getCommands();
            }
        }
        return null;
    }
}
