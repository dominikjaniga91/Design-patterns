package org.patterns.headfirstdesignpatterns.observer;

interface Subject {

    void subscribe(WeatherObserver observer);
    void unsubscribe(WeatherObserver observer);
    void notifyObservers();


}
