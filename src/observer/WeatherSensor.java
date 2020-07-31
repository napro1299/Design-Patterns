package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherSensor implements Observable {

    private List<Observer> observers = new ArrayList<Observer>();

    private float temperature;
    private float atmPressure;
    private float humidity;

    public WeatherSensor() {
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void setReadings(float temp, float atm, float hmd) {
        this.temperature = temp;
        this.atmPressure = atm;
        this.humidity = hmd;
        this.notifyAllObservers();
    }

    public float getTemperature() {
        return this.temperature;
    }

    public float getAtmPressure() {
        return this.atmPressure;
    }

    public float getHumidity() {
        return this.humidity;
    }
}
