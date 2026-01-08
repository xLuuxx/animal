package TP1;

public class Main {
    static void main(String[] args) {
        Cow cow= new Cow("Vachette", 2);
        System.out.println(cow.name);
        cow.makeSound();
        Animal.commonRule();
        cow.eat();

        Dog dog = new Dog("Hercule", 3);
        System.out.println(dog.name);
        dog.eat();
        dog.eat("os");
        dog.drink("water", "dog");
    }
}
