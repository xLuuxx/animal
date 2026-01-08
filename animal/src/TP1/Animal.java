package TP1;

public abstract class Animal {
    String name;
    int age;
    private int LegNumber;
    protected String EyeColor;
    public String FurColor;

    public Animal(String name, int age, String EyeColor, String FurColor, int LegNumber) {
        this.name = name;
        this.age = age;
        this.EyeColor = EyeColor;
        this.FurColor = FurColor;
        this.LegNumber = LegNumber;
    }

    public int getLegNumber() {
        return LegNumber;
    }

    public String getEyeColor() {
        return EyeColor;
    }

    public String getFurColor() {
        return FurColor;
    }

    public abstract void makeSound();

    public static void commonRule() {
        System.out.println("All animal needs to eat in order to survive");
    }

    public void eat() {
        System.out.println("The " + this.name + " is eating");
    }

    public void eat(String food) {
        System.out.println("The " + this.name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println("The " + this.name + " is drinking " + drink);
    }

    private void sleep() {
        System.out.println("The " + this.name + " is sleeping");
    }

    protected void walk() {
        System.out.println("The " + this.name + " is walking");
    }

    void run() {
        System.out.println("The " + this.name + " is running");
    }
}
