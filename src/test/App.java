package test;

import model.Person;

public class App {

    public static void main(String[] args) {
        Person per = new Person("Per", 20);
        System.out.println(per);

        Person ulla = new Person("Ulla", 25);
        System.out.println(ulla);

        Person pia = new Person("Pia", 30);
        System.out.println(pia);
    }
}
