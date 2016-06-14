package de.uni_hamburg.informatik.swt.se2.kino.observer;

public class CountingObserver implements Observer
{
    private int _callCount;

    public CountingObserver()
    {
        _callCount = 0;
    }

    @Override
    public void react(Observable source)
    {
        _callCount++;
    }

    public int getCallCount()
    {
        return _callCount;
    }
}
