package PizzaStore.Chicago;

import Pizza.Pizza;
import Pizza.Chicago.ChicagoStyleCheesePizza;
import PizzaStore.PizzaStore;
import PizzaIngredientFactory.*;
import PizzaIngredientFactory.Chicago.ChicagoPizzaIngredientFactory;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        // TODO Auto-generated method stub

        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        Pizza pizza = null;

        if (type.toLowerCase() == "cheese") {
            pizza = new ChicagoStyleCheesePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }

        return pizza;
    }

    
}