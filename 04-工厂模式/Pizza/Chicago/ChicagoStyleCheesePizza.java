package Pizza.Chicago;


import Pizza.*;
import PizzaIngredientFactory.PizzaIngredientFactory;


public class ChicagoStyleCheesePizza extends Pizza{

    PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
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

    public void cut() {
        System.out.println("Cutting the pizza into square slices\n");
    }
    
}