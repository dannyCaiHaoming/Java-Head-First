import Fly.*;
import Quack.*;

public abstract class Duck{

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior fb) {
        fb = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior qb){
        qb = quackBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    
}