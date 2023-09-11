package org.patterns.headfirstdesignpatterns.observer;

import java.util.ArrayList;
import java.util.List;

class StatisticDisplay implements WeatherObserver, DisplayElement {

    private final List<Float> temperatureHistory;
    private final List<Float> humidityHistory;
    private final List<Float> pressureHistory;
    private final WeatherData weatherData;

    public StatisticDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        temperatureHistory = new ArrayList<>();
        humidityHistory = new ArrayList<>();
        pressureHistory = new ArrayList<>();
        weatherData.subscribe(this);
    }

    @Override
    public void display() {
        System.out.println("Statistics for last 7d:");
        System.out.printf("Temperature avg: %s%n", this.temperatureHistory);
        System.out.printf("Humidity avg: %s%n %%", this.humidityHistory);
        System.out.printf("Pressure avg: %s%n", this.pressureHistory);
    }

    @Override
    public void update() {
        this.temperatureHistory.add(weatherData.getTemperature());
        this.humidityHistory.add(weatherData.getHumidity());
        this.pressureHistory.add(weatherData.getPressure());
        display();
    }
}
