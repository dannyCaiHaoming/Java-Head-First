package PizzaIngredientFactory.NY;


import PizzaIngredientFactory.PizzaIngredientFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public String createDough() {
        // TODO Auto-generated method stub
        return "ThinCrustDough";
    }

    @Override
    public String createSauce() {
        // TODO Auto-generated method stub
        return "MarinaraSauce";
    }

    @Override
    public String createCheese() {
        // TODO Auto-generated method stub
        return "ReggianoCheese";
    }

    @Override
    public String[] createVeggiese() {
        // TODO Auto-generated method stub
        String[] veggiese = {"Garlic","Onion","Mushroom","RedPepper"};
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
        return "FreshClams";
    }

    
    
}