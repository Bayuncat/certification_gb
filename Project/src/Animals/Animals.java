package Animals;

import java.io.Serializable;

public abstract class Animals implements Serializable {
    public String name;
    public int age;
    public String commands;

    public Animals(String name, int age, String commands) {
        this.name = name;
        this.age = age;
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        return "Класс животного - " + this.getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", commands='" + commands + '\'' + "}";
    }
}
