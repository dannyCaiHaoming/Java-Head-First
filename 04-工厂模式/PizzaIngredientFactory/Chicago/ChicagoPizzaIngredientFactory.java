package PizzaIngredientFactory.Chicago;

import PizzaIngredientFactory.PizzaIngredientFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public String createDough() {
        // TODO Auto-generated method stub
        return "ThickCrustDough";
    }

    @Override
    public String createSauce() {
        // TODO Auto-generated method stub
        return "PlumTomatoSauce";
    }

    @Override
    public String createCheese() {
        // TODO Auto-generated method stub
        return "MozzarellaCheese";
    }

    @Override
    public String[] createVeggiese() {
        // TODO Auto-generated method stub
        String[] veggiese = {"BlackOlives",
        "Spinach",
        "Eggplant" };
        return veggiese;
    }

    @Override
    public String createPepperoni() {
        // TODO Auto-generated method stub
        return "SlicedPepperoni";
    }

    @Override
    public String createClam() {
        // TODO Auto-generated method stub
        return "FrozenClams";
    }

    
}