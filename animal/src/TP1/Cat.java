package TP1;

public class Cat extends Animal implements Pet, Wild {
    public Cat(String name, int age) {
        super(name, age, "Green", "White", 4);
    }

    @Override
    public void play(String animal) {
        System.out.println("Mind " + animal + "'s claws!");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void hunt() {
        System.out.println(this.name + " is hunting mice!");
    }
}
