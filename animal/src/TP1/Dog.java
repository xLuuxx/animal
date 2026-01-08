package TP1;

public class Dog extends Animal implements Pet {
    public Dog(String name, int age) {
        super(name, age, "Brown", "Black", 4);
    }

    @Override
    public void eat() {
        System.out.println("Munch Munch the dog foodie");
    }

    @Override
    public void play(String animal) {
        System.out.println(animal + " is playing");
    }
}
