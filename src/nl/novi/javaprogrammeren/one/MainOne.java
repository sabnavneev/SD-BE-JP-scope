package nl.novi.javaprogrammeren.one;

public class MainOne {

    public static void main(String[] args) {

        Person sjaak = new Person("Nick", 30);

        sjaak.ageOneYear(sjaak.getAge());
        System.out.println(sjaak.getName() + " is " + sjaak.getAge() + " jaar oud");
    }
}
