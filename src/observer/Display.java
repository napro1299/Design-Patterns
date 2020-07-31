package observer;

public class Display implements Observer {
    @Override
    public void update(Observable observable) {
        WeatherSensor weatherSensor = (WeatherSensor) observable;
        System.out.println(getClass().getSimpleName() + " received update from " + observable.getClass().getSimpleName());
        System.out.println("TEMP: " + weatherSensor.getTemperature() +
                "\nATM: " + weatherSensor.getAtmPressure() +
                "\nHMD: " + weatherSensor.getHumidity());
    }
}
