package test;

import model.Person;

public class App {

    public static void main(String[] args) {
        Person per = new Person("Per");
        System.out.println(per.getName());

        Person ulla = new Person("Ulla");
        System.out.println(ulla.getName());

        Person jens = new Person("Jens");
        System.out.println(ulla.getName());
    }
}
