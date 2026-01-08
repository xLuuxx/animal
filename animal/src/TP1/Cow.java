package TP1;

class Cow extends Animal {
    public Cow(String name, int age) {
        super(name, age, "Black", "White&Black", 4);
    }

    @Override
    public void makeSound() {
        System.out.println("Moo");
    }

}