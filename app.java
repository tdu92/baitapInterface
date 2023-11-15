import src.Cat;
import src.Chicken;
import src.Dog;

public class app {
    public static void main(String[] args){
        Dog Frank = new Dog("Frank" );
        Cat Tom = new Cat("Tom" );
        Chicken Bin = new Chicken("Bin" );

        System.out.println("Frank makes sounds: " + Frank.makeSound() + Frank.swim());
        System.out.println("Frank makes sounds: " + Tom.makeSound() + Tom.swim());
        System.out.println("Frank makes sounds: " + Bin.makeSound() + Bin.swim());
    }
}
