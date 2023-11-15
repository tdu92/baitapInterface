package src;

public class Cat extends Animal implements Swimable {


    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Meow! Meow! Meow! ";

    }

    @Override
    public String swim() {
        return " Cat can swim";
    }
}
