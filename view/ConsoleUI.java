// package view;

// import presenter.AnimalRegistryPresenter;
// import java.util.Scanner;

// public class ConsoleUI implements AnimalRegistryView {
//     private Scanner scanner = new Scanner(System.in);
//     private AnimalRegistryPresenter presenter;
    
//     public ConsoleUI(AnimalRegistryPresenter presenter) {
//         this.presenter = presenter;
//     }

//     public String getCommand() {
//         System.out.print("Введите команду: ");
//         return scanner.nextLine();
//     }

//     public String getAnimalNameInput() {
//         System.out.print("Введите имя животного: ");
//         return scanner.nextLine();
//     }

//     public String getAnimalBirthDateInput() {
//         System.out.print("Введите дату рождения животного (формат: yyyy-MM-dd): ");
//         return scanner.nextLine();
//     }

//     public int getAnimalTypeInput() {
//         System.out.println("Выберите тип животного:");
//         System.out.println("1. Собака\n2. Кошка\n3. Хомяк\n4. Лошадь\n5. Верблюд\n6. Осел");
//         System.out.print("> ");
//         return Integer.parseInt(scanner.nextLine());
//     }

//     public int getAnimalIdInput() {
//         System.out.print("Введите ID животного: ");
//         return Integer.parseInt(scanner.nextLine());
//     }

//     public String getCommandInput() {
//         System.out.print("Введите команду для животного: ");
//         return scanner.nextLine();
//     }

//     public void displayMessage(String message) {
//         System.out.println(message);
//     }

//     public void start() {
//         boolean exit = false;
//         while (!exit) {
//             System.out.println("\n1. Добавить животное");
//             System.out.println("2. Показать список команд животного");
//             System.out.println("3. Обучить животное новой команде");
//             System.out.println("4. Показать список животных по дате рождения");
//             System.out.println("5. Показать общее количество животных");
//             System.out.println("6. Показать всех животных");
//             System.out.println("0. Выйти");
//             System.out.print("> ");
    
//             String command = getCommand();
//             switch (command) {
//                 case "1":
//                     presenter.addAnimal();
//                     break;
//                 case "2":
//                     presenter.displayCommandsForAnimal();
//                     break;
//                 case "3":
//                     presenter.addCommandToAnimal();
//                     break;
//                 case "4": 
//                     presenter.displayAnimalsByBirthDate();
//                     break;
//                 case "5":
//                     presenter.displayAnimalCount();
//                     break;
//                 case "6":
//                     presenter.displayAllAnimals();
//                     break;
//                 case "0":
//                     exit = true;
//                     displayMessage("Программа завершена.");
//                     break;
//                 default:
//                     displayMessage("Неверная команда. Попробуйте снова.");
//             }
//         }
//     }
    
// }









package view;

import presenter.AnimalRegistryPresenter;
import java.util.Scanner;

public class ConsoleUI implements AnimalRegistryView {
    private Scanner scanner = new Scanner(System.in);
    private AnimalRegistryPresenter presenter;

    public ConsoleUI(AnimalRegistryPresenter presenter) {
        this.presenter = presenter;
    }

    public String getCommand() {
        System.out.print("Введите команду: ");
        return scanner.nextLine();
    }

    public String getAnimalNameInput() {
        System.out.print("Введите имя животного: ");
        return scanner.nextLine();
    }

    public String getAnimalBirthDateInput() {
        System.out.print("Введите дату рождения животного (формат: yyyy-MM-dd): ");
        return scanner.nextLine();
    }

    public int getAnimalTypeInput() {
        System.out.println("Выберите тип животного:");
        System.out.println("1. Домашнее животное\n2. Вьючное животное");
        System.out.print("> ");
        return Integer.parseInt(scanner.nextLine());
    }

    public int getPetTypeInput() {
        System.out.println("Выберите вид домашнего животного:");
        System.out.println("1. Собака\n2. Кошка\n3. Хомяк");
        System.out.print("> ");
        return Integer.parseInt(scanner.nextLine());
    }

    public int getPackAnimalTypeInput() {
        System.out.println("Выберите вид вьючного животного:");
        System.out.println("1. Лошадь\n2. Верблюд\n3. Осел");
        System.out.print("> ");
        return Integer.parseInt(scanner.nextLine());
    }

    public int getAnimalIdInput() {
        System.out.print("Введите ID животного: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String getCommandInput() {
        System.out.print("Введите команду для животного: ");
        return scanner.nextLine();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void start() {
        boolean exit = false;
        while (!exit) {
            System.out.println("\n1. Добавить животное");
            System.out.println("2. Показать список команд животного");
            System.out.println("3. Обучить животное новой команде");
            System.out.println("4. Показать список животных по дате рождения");
            System.out.println("5. Показать общее количество животных");
            System.out.println("6. Показать всех животных");
            System.out.println("0. Выйти");
            System.out.print("> ");
    
            String command = getCommand();
            switch (command) {
                case "1":
                    presenter.addAnimal();
                    break;
                case "2":
                    presenter.displayCommandsForAnimal();
                    break;
                case "3":
                    presenter.addCommandToAnimal();
                    break;
                case "4": 
                    presenter.displayAllAnimals();
                    break;
                case "5":
                    presenter.displayAnimalCount();
                    break;
                case "6":
                    presenter.displayAllAnimals();
                    break;
                case "0":
                    exit = true;
                    displayMessage("Программа завершена.");
                    break;
                default:
                    displayMessage("Неверная команда, попробуйте снова.");
            }
        }
    }
}
