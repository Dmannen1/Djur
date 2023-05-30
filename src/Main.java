public class Main {
    public static void main(String[] args) {


        Animal animal = new Animal("Djur");
        Dog dog = new Dog("David");

        animal.eat();
        animal.sleep();

        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
