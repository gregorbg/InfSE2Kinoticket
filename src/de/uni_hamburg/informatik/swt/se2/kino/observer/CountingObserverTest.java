package de.uni_hamburg.informatik.swt.se2.kino.observer;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertSame;

public class CountingObserverTest
{
    private CountingObservable _observable;
    private CountingObserver[] _observers;

    private Random _random;

    public CountingObserverTest() {
        _random = new Random();

        _observable = new CountingObservable();

        int observerCount = _random.nextInt(10) + 1;
        _observers = new CountingObserver[observerCount];

        for (int i = 0; i < observerCount; i++)
        {
            CountingObserver observer = new CountingObserver();
            _observable.addObserver(observer);
            _observers[i] = new CountingObserver();

        }
    }

    @Test
    public void testReactCalls() {
        int reactCalls = _random.nextInt(1000) + 1;

        for (int i = 0; i < reactCalls; i++)
        {
            _observable.notifyObservers();
        }

        for (CountingObserver observer : _observers)
        {
            assertSame(observer.getCallCount(), reactCalls);
        }
    }
}
