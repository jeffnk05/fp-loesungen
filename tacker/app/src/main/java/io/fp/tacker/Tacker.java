package io.fp.tacker;

public class Tacker {
    
    private Magazin magazin;
    private int maxAnzahlSeiten;

    public Tacker(int maxAnzahlSeiten) {
        magazin = new Magazin();
        this.maxAnzahlSeiten=maxAnzahlSeiten;
    }

    public void ladeTacker(int anzahlKlammern) {
        magazin.ladeMagazin(anzahlKlammern);
    }

    public void tackerSeiten(int anzahlSeiten) {
        if (anzahlSeiten<=maxAnzahlSeiten) {
            magazin.entnimmtKlammer(); 
            System.out.println("Tackern von "+anzahlSeiten+" Seiten erfolgreich!");   
        } else {
            System.out.println("Ausnahme: Anzahl Seiten zu groß, tackern nicht erfolgreich!");;
        }
    }
}
