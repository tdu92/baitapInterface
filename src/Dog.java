package src;

public class Dog extends Animal implements Swimable {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Bak! Bak! Bak! ";
    }

    public String swim() {
        return "Dog can swim";

    }
}

