package Pizza;

import java.util.ArrayList;

public abstract class Pizza {

    public String name;
    public String dough;
    public String sauce;
    public String cheese;
    public String[] veggies;
    public String pepperoni;
    public String clam;

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350\n");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices\n");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box\n");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        System.out.println("/ Dough = " + dough);
        System.out.println("/ Sauce = " + sauce);
        System.out.println("/ Cheese = " + cheese);
        // System.out.println("/ Veggies = " + veggies);
        for (int i = 0; i < veggies.length; i++) {
            System.out.println("/ Veggies = " + veggies[i]);
        }
        System.out.println("/ Pepperoni = " + pepperoni);
        System.out.println("/ Clam = " + clam);
        return null;
    }
}