import Animals.Animals;
import PackAnimals.*;
import Pets.*;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Services {


// ���������� ������ ���������
public void addAnimal(ArrayList<Animals> AnimalsList) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("��� ������� : ");
    String name = scanner.nextLine();

    System.out.println("��� �� ����� ������, ����� ������� ��������� : ");
    String commands = scanner.nextLine();

    System.out.println("������� ��� ����� ��������� : ");
    int age = scanner.nextInt();


    System.out.println("��� ��� ��������:");
    System.out.println("-------------------------");
    System.out.println("1 - �����");
    System.out.println("2 - ������");
    System.out.println("3 - �����");
    System.out.println("4 - �������");
    System.out.println("5 - ������");
    System.out.println("6 - � ���� - ����");

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
        System.out.println("�� ����� �� �����, �������� ����� �� 1 �� 6!");
    }
}
// ������� ���������

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
// �������� ����� �������




