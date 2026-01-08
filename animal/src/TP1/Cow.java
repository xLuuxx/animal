package TP1;

class Cow extends Animal implements Pet {
    public Cow(String name, int age) {
        super(name, age, "Black", "White&Black", 4);
    }

    @Override
    public void makeSound() {
        System.out.println("Moo");
    }

    @Override
    public void play(String animal) {
        System.out.println("You shouldn't play with a " + animal + ". They are too big!");
    }
}