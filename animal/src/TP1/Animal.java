package TP1;

public class Animal  {
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

    //GETTER
    public int getLegNumber() {
        return LegNumber;
    }
    public String getEyeColor() {
        return EyeColor;
    }
    public String getFurColor() {
        return FurColor;
    }

    //METHODS
    public void makeSound() {
        System.out.println("animal sounds");
    }

    public static void commonRule() {
        System.out.println("All animal needs to eat in order to survive");
    }

    public void eat() {
        System.out.println("The animal is eating");
    }

    public void eat(String food) {
        System.out.println("The animal is eating " + food);
    }

    public void drink(String drink, String animal) {
        System.out.println("The " + animal + " is drinking " + drink);
    }

    private void sleep(String animal) {
        System.out.println("The " + animal + " is sleeping");
    }

    protected void walk(String animal) {
        System.out.println("The " + animal + " is walking");
    }

    void run(String animal) {
        System.out.println("The " + animal + " is running");
    }
}
