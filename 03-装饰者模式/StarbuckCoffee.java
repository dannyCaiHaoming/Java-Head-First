import Beverage.*;
import Condiment.*;


public class StarbuckCoffee {

    public static void main(String arg[]) {
        
        System.out.println("-----------------------\n");
        //
        Beverage b1 = new Espresso();
        print(b1);

        //
        Beverage b2 = new DarkRost();
        b2 = new Mocha(b2);
        b2 = new Mocha(b2);
        b2 = new Whip(b2);
        print(b2);

        //
        Beverage b3 = new HouseBlend();
        b3 = new Soy(b3);
        b3 = new Mocha(b3);
        b3 = new Whip(b3);
        print(b3);

        System.out.println("-----------------------\n");
    }


    static void print(Beverage beverage){
        System.out.println(beverage.getDescription()+ " $" + beverage.cost() + "\n");
    }
}