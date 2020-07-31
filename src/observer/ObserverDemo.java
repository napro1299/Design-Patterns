package observer;

public class ObserverDemo {

    public static void main(String[] args) {
        WeatherSensor sensor = new WeatherSensor();
        Display display = new Display();

        sensor.register(display);
        sensor.setReadings(28, 58, 340);
        sensor.setReadings(8982, 74829, 45729);

    }

}
