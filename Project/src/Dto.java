import Animals.Animals;
import java.io.*;
import java.util.ArrayList;

public class Dto {

    // Сериализация объектов в файл
    public void writeObject(ArrayList<Animals> AnimalsList) throws IOException {
        //Create FileOutputStream to write file
        FileOutputStream fos = new FileOutputStream("DB.data");
        //Create ObjectOutputStream to write object
        ObjectOutputStream objOutputStream = new ObjectOutputStream(fos);
        //Write object to file
        for (Animals animal : AnimalsList) {

            objOutputStream.writeObject(animal);
            objOutputStream.reset();
        }
        objOutputStream.close();
    }
    // Десериализация объектов из файла
    public ArrayList<Animals> readObject() throws ClassNotFoundException, IOException {
        ArrayList<Animals> AnimalsList = new ArrayList();
        //Create new FileInputStream object to read file
        FileInputStream fis = new FileInputStream("DB.data");
        //Create new ObjectInputStream object to read object from file
        ObjectInputStream obj = new ObjectInputStream(fis);
        try {
            while (fis.available() != -1) {
                //Read object from file
                Animals animal = (Animals) obj.readObject();
                AnimalsList.add(animal);
            }
        } catch (EOFException ex) {

        }
        return AnimalsList;
    }
}
