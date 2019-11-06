import data.Person;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Pepe");

        String name = person.getName();

        System.out.println(name);
    }
}
