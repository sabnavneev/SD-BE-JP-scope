package nl.novi.javaprogrammeren.one;

public class Person {
    private String name;
    private int age;

    //Constructor
    public Person(String name , int age) {
        this.name = name;
        this.age = age;
    }

    //Getters & Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //Methode
    public void setAge(int age) {
        this.age = age;
    }

    public void ageOneYear(int i) {
        this.age++;
    }
}