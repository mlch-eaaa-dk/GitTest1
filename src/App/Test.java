package App;

import model.Person;

public class Test {

    public static void main(String[] args) {
        Person ib = new Person("Ib");
        System.out.println(ib.getName());

        Person ulla = new Person("Ulla");
        System.out.println(ulla.getName());
    }
}
