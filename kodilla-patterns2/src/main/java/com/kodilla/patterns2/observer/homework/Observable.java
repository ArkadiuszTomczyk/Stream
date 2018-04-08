package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void registeredObserver(Observer observer);
    void notifyObserver();
}
