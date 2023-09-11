package org.patterns.headfirstdesignpatterns.observer;

import java.util.ArrayList;

class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData(new ArrayList<>());
        new CurrentConditionDisplay(weatherData);
        new StatisticDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 45);
        weatherData.setMeasurements(81, 63, 44);
        weatherData.setMeasurements(82, 66, 47);
    }
}
