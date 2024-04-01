import Animals.Animals;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Dto dto = new Dto();
        Services service = new Services();
        ArrayList<Animals> AnimalsList = dto.readObject();


        Boolean q = true;
        while (q) {
            System.out.println("Выбирайте действие:");
            System.out.println("-------------------------");
            System.out.println("1 - Вывести список всех животных и их количество");
            System.out.println("2 - Добавить животное");
            System.out.println("3 - Список команд животного");
            System.out.println("4 - Обучить животное новой команде");
            System.out.println("5 - Записать изменения в базу");
            System.out.println("6 - Выход (не забудьте записать изменения!)");
            Scanner scanner = new Scanner(System.in);

            try {

            int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
//                System.out.println(AnimalsList.toString());
                        service.printAnimals(AnimalsList);

                        System.out.println("Котов = " + service.culculationCats(AnimalsList));
                        System.out.println("Собак = " + service.culculationDogs(AnimalsList));
                        System.out.println("Хомяков = " + service.culculationHamsters(AnimalsList));
                        System.out.println("Лошадей = " + service.culculationHorses(AnimalsList));
                        System.out.println("Верблюдов = " + service.culculationCamels(AnimalsList));
                        System.out.println("Ослов = " + service.culculationDonkeys(AnimalsList));

                        break;
                    case 2:
                        service.addAnimal(AnimalsList);
                        break;
                    case 3:
                        System.out.println("Выбирайте индекс животного из списка и получите списко команд :");
                        Scanner scanner2 = new Scanner(System.in);
                        int animalnum = scanner2.nextInt();
                        System.out.println(AnimalsList.get(animalnum).commands);
                        break;
                    case 4:
                        Boolean ch = true;

                        System.out.println("Выбирайте индекс животного из списка, чтобы обучить его новой команде :");
                        Scanner scanner3 = new Scanner(System.in);
                        int animalcomnum = scanner3.nextInt();
                        System.out.println("Он уже умеет " + AnimalsList.get(animalcomnum).commands);

                        System.out.println("Научу его еще делать : ");
                        Scanner scanner4 = new Scanner(System.in);
                        String newcomand = scanner4.nextLine();

                        newcomand = AnimalsList.get(animalcomnum).commands + " ," + newcomand;
                        AnimalsList.get(animalcomnum).setCommands(newcomand);

                        break;
                    case 5:
                        dto.writeObject(AnimalsList);
                        break;
                    case 6:
                        q = false;
                        break;
                    default:
                        break;

                }
            } catch(InputMismatchException e){
            System.out.println("Вы ввели не число, пробуйте заново!");
        }
        }


    }
}