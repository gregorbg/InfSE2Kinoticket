package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable
{
    private List<Observer> _beobachterListe;
    
    public Observable()
    {
        _beobachterListe = new ArrayList<Observer>();
    }
    
    
    public void registriereBeobachter(Observer beobachter)
    {
        assert beobachter != null : "Vorbedingung verletzt: beobachter != null";
        if (!_beobachterListe.contains(beobachter))
        {
            _beobachterListe.add(beobachter);
        }
    }

    
    public void entferneBeobachter(Observer beobachter)
    {
        assert beobachter != null : "Vorbedingung verletzt: beobachter != null";
        _beobachterListe.remove(beobachter);
    }

    /**
     * Informiert alle angemeldeten Beobachter dass eine relevante Änderung
     * eingetreten ist.
     */
    protected void informiereUeberAenderung()
    {
        for (Observer beobachter : _beobachterListe)
        {
            beobachter.reagiereAufAenderung();
        }
    }
}
