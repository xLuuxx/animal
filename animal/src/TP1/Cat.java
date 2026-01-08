package TP1;

public class Cat extends Animal implements Pet {
    public Cat(String name, int age) {
        super(name, age, "Black", "White&Black", 4);
    }

    @Override
    public void play(String animal) {
        System.out.println("Mind " + animal + "'s claws !");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
