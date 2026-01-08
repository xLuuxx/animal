package TP1;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("animal sounds");
    }

    public static void commonRule() {
        System.out.println("The animal needs to eat in order to survive");
    }

    public void eat() {
        System.out.println("The animal is eating");
    }

    public void eat(String food) {
        System.out.println("The animal is eating " + food);
    }

    public void drink(String drink, String animal) {
        System.out.println("The " + animal + " is drinking " + drink);
    }
}
