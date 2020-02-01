package Subject;

import java.util.ArrayList;

import Observer.Observer;

public class WeatherData implements Subject {
    
    private ArrayList<Observer> observerList;


    public WeatherData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer ob) {
        // TODO Auto-generated method stub
        observerList.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        // TODO Auto-generated method stub
        int i = observerList.indexOf(ob);
        if (i >= 0) {
            observerList.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        for (int i = 0; i < observerList.size(); i++){
            Observer ob = (Observer)observerList.get(i);
            ob.update();
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }


    public void updateMeaurements() {
        measurementsChanged();
    }

    
}