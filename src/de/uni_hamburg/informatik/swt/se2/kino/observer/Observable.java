package de.uni_hamburg.informatik.swt.se2.kino.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable
{
    private List<Observer> _observers;

    public Observable()
    {
        _observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        _observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        _observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : _observers) {
            observer.react(this);
        }
    }
}
