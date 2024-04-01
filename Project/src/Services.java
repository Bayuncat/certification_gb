import Animals.Animals;
import PackAnimals.*;
import Pets.*;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Services {


// Добавление нового животного
public void addAnimal(ArrayList<Animals> AnimalsList) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Имя новичка : ");
    String name = scanner.nextLine();

    System.out.println("Что он умеет делать, какие команды выполняет : ");
    String commands = scanner.nextLine();

    System.out.println("Сколько лет этому животному : ");
    int age = scanner.nextInt();


    System.out.println("Кто это животное:");
    System.out.println("-------------------------");
    System.out.println("1 - Кошка");
    System.out.println("2 - Собака");
    System.out.println("3 - Хомяк");
    System.out.println("4 - Верблюд");
    System.out.println("5 - Лошадь");
    System.out.println("6 - С виду - Осел");

    try {
    int choice = scanner.nextInt();

        switch (choice) {
        case 1: AnimalsList.add(new Cats(name, age, commands));
            break;
        case 2: AnimalsList.add(new Dogs(name, age, commands));
            break;
        case 3: AnimalsList.add(new Hamsters(name, age, commands));
            break;
        case 4: AnimalsList.add(new Camels(name, age, commands));
            break;
        case 5: AnimalsList.add(new Horses(name, age, commands));
           break;
        case 6: AnimalsList.add(new Donkeys(name, age, commands));
            break;
        default:
            break;
    }
    } catch(InputMismatchException e){
        System.out.println("Вы ввели не число, пробуйте число от 1 до 6!");
    }
}
// Рассчет поголовья

    public int culculationCats(ArrayList<Animals> AnimalsList) {
        int count =0;
        for (Animals a : AnimalsList)
        {
            if (a instanceof Cats)
            {
                count++;
            }
        } return count;
    }

    public int culculationDogs(ArrayList<Animals> AnimalsList) {
        int count =0;
        for (Animals a : AnimalsList)
        {
            if (a instanceof Dogs)
            {
                count++;
            }
        } return count;
    }

    public int culculationHamsters(ArrayList<Animals> AnimalsList) {
        int count =0;
        for (Animals a : AnimalsList)
        {
            if (a instanceof Hamsters)
            {
                count++;
            }
        } return count;
    }

    public int culculationCamels(ArrayList<Animals> AnimalsList) {
        int count =0;
        for (Animals a : AnimalsList)
        {
            if (a instanceof Camels)
            {
                count++;
            }
        } return count;
    }

    public int culculationHorses(ArrayList<Animals> AnimalsList) {
        int count =0;
        for (Animals a : AnimalsList)
        {
            if (a instanceof Horses)
            {
                count++;
            }
        } return count;
    }

    public int culculationDonkeys(ArrayList<Animals> AnimalsList) {
        int count =0;
        for (Animals a : AnimalsList)
        {
            if (a instanceof Donkeys)
            {
                count++;
            }
        } return count;
    }

    public void printAnimals(ArrayList<Animals> AnimalsList) {
        for (Animals a : AnimalsList)
        {

            System.out.println(AnimalsList.indexOf(a) + ". " + a.toString());
        }

}
}
// Обучение новой команде




