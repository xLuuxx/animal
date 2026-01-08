package TP1;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("John"); // Create an owner

        Cow cow = new Cow("Vachette", 2); // Create a cow
        owner.addAnimal(cow); // Add the cow to the owner's list
        System.out.println(cow.name); // Access cow name
        cow.makeSound(); // Cow sound
        cow.eat(); // Cow eating

        Animal.commonRule(); // Common rule for all animals

        Dog dog = new Dog("Hercule", 3); // Create a dog
        owner.addAnimal(dog); // Add the dog to the owner's list
        System.out.println(dog.name); // Access dog name
        dog.eat(); // Dog eating
        dog.eat("os"); // Dog eating specific food
        dog.drink("water"); // Dog drinking

        Cat cat = new Cat("Inari", 1); // Create a cat
        owner.addAnimal(cat); // Add the cat to the owner's list
        System.out.println(cat.name); // Access cat name
        cat.makeSound(); // Cat sound


        //System.out.println(dog.LegNumber); can't access because it's private
        //dog.sleep(); // can't access because it's private
        dog.walk(); // I can access because it's protected and in the same package
        dog.run(); // I can access because it's default and in the same package
        cow.walk(); // I can access because it's protected and in the same package
        cow.run(); // I can access because it's default and in the same package

        System.out.println("Couleur des yeux: " + dog.getEyeColor()); // I can access because it's protected and in the same package
        System.out.println("Couleur du pelage: " + dog.getFurColor()); // I can access because it's public

        System.out.println("Couleur des yeux: " + cow.getEyeColor()); // I can access because it's protected and in the same package
        System.out.println("Couleur du pelage: " + cow.getFurColor()); // I can access because it's public


        Pet pet1 = new Dog("Buddy", 4);
        pet1.play("Buddy");

        Pet pet2 = new Cat("Inari", 2);
        pet2.play("Inari");

        Pet pet3 = new Cow("Bessie", 5);
        pet3.play("Bessie");


        cat.hunt();
        // Animal animal = new Animal("Test", 5, "Blue", "Red", 4); trying to instantiate an abstract class, but I can't
    }
}
