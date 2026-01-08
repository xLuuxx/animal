package TP1;

class Cow extends Animal {
    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Moo");
    }
}