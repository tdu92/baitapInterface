package src;

public class Chicken extends Animal implements Swimable {


    public Chicken(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "chick! chick! chick!";
    }

    @Override
    public String swim() {
        return "Chicken can swim";
    }
}
