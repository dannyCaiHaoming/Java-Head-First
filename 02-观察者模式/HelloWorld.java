import DisplayElement.*;
import Subject.*;

public class HelloWorld {

    public static void main(String[] args) {

        WeatherData data = new WeatherData();

        CurrentConditionsDisplay display = new CurrentConditionsDisplay(data);

        System.out.println("WeatherData updateMeaurements");

        data.updateMeaurements();


    }
}