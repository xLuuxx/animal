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

        //System.out.println(dog.LegNumber); can't access because it's private
        //dog.sleep(); // can't access because it's private
        dog.walk("dog"); // I can access because it's protected and in the same package
        dog.run("dog"); // I can access because it's default and in the same package
        cow.walk("cow"); // I can access because it's protected and in the same package
        cow.run("cow"); // I can access because it's default and in the same package

        System.out.println("Couleur des yeux: " + dog.getEyeColor()); // I can access because it's protected and in the same package
        System.out.println("Couleur du pelage: " + dog.getFurColor()); // I can access because it's public

        System.out.println("Couleur des yeux: " + cow.getEyeColor()); // I can access because it's protected and in the same package
        System.out.println("Couleur du pelage: " + cow.getFurColor()); // I can access because it's public

        dog.play("dog");
    }
}
