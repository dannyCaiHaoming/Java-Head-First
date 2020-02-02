 package PizzaStore.NY;

import Pizza.Pizza;
import Pizza.NY.NYStyleCheesePizza;
import PizzaStore.PizzaStore;
import PizzaIngredientFactory.*;
import PizzaIngredientFactory.NY.NYPizzaIngredientFactory;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        Pizza pizza = null;

        // TODO Auto-generated method stub
        if (type.toLowerCase() == "cheese") {
            pizza =  new NYStyleCheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }

        return pizza;
    }
    
} 
 

      