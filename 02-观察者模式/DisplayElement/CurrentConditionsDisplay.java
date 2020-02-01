package DisplayElement;


import Observer.*;
import Subject.*;


public class CurrentConditionsDisplay implements Observer,DisplayElement{

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("CurrentConditionsDisplay Display");
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        System.out.println("CurrentConditionsDisplay Update");
        this.display();
    }

    
}