package org.patterns.headfirstdesignpatterns.observer;

import java.util.List;

class WeatherData implements Subject {

    private final List<WeatherObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(List<WeatherObserver> observers) {
        this.observers = observers;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
    @Override
    public void subscribe(WeatherObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(WeatherObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(WeatherObserver::update);
    }
}
