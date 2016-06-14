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

    /**
     * Registriert einen Beobachter
     *
     * @param observer Der hinzuzufuegende Beobachter
     *
     * @require observer != null
     * @ensure _observers.contains(observer)
     */
    public void addObserver(Observer observer) {
        assert observer != null : "Vorbedingung verletzt: null!";
        _observers.add(observer);
    }

    /**
     * Entfernt einen Beobachter
     *
     * @param observer Der zu entfernende Beobachter
     *
     * @require observer != null
     */
    public void removeObserver(Observer observer) {
        assert observer != null : "Vorbedingung verletzt: null!";
        _observers.remove(observer);
    }

    /**
     * Benachrichtige alle registrierten Beobachter, dass etwas passiert ist
     */
    public void notifyObservers() {
        for (Observer observer : _observers) {
            observer.react(this);
        }
    }
}