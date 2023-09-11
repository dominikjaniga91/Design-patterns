package org.patterns.headfirstdesignpatterns.observer;

class CurrentConditionDisplay implements WeatherObserver, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private final WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.subscribe(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:");
        System.out.printf("Temperature: %f%n F degrees", this.temperature);
        System.out.printf("Humidity: %f%n %%", this.humidity);
        System.out.printf("Pressure: %f%n", this.pressure);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }
}
