import Pizza.Pizza;
import PizzaStore.*;
import PizzaStore.Chicago.ChicagoStylePizzaStore;
import PizzaStore.NY.NYStylePizzaStore;


public class PizzaTestDrive {

    public static void main(String[] arg) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagostore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        
        pizza = chicagostore.orderPizza("cheese");

    }
}