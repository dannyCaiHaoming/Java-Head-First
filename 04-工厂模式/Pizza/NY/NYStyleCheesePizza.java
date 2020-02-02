package Pizza.NY;

import Pizza.*;
import PizzaIngredientFactory.*;

public class NYStyleCheesePizza extends Pizza{

    PizzaIngredientFactory pizzaIngredientFactory;

    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory){

        this.pizzaIngredientFactory = pizzaIngredientFactory;

    }
    
    public void prepare(){

        System.out.println("----------------\n");
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggiese();
        pepperoni = pizzaIngredientFactory.createPepperoni();
        clam = pizzaIngredientFactory.createClam();
        toString();
        
    }
}