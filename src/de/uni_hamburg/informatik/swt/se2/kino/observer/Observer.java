package de.uni_hamburg.informatik.swt.se2.kino.observer;

public interface Observer
{
    /**
     * Reagiere auf eine von <code>source</code> ausgegebene Aenderung
     *
     * @param source Der <code>Observable</code> von dem die Aenderung kommt
     */
    void react(Observable source);
}
