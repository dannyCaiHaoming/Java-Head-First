import Fly.*;
import Quack.*;

public class MallarDuck extends Duck {
    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){

    }
    
}