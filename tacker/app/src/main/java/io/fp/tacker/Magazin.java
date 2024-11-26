package io.fp.tacker;

public class Magazin {
    
    private int anzahlKlammern = 0;
    private int maxAnzahlklammern = 100;

    public void ladeMagazin(int anzahlKlammern) {
        if (anzahlKlammern + this.anzahlKlammern <= maxAnzahlklammern) {
            this.anzahlKlammern += anzahlKlammern;
        } else {
            System.out.println("Ausnahe: Zu viele Klammern, beladen nicht erflogreich!");
        }
    }

    public void entnimmtKlammer() {
        if (anzahlKlammern > 0) {
            anzahlKlammern --;
        } else {
            System.out.println("Ausnahme: Magazin ist leer, Entnahme nicht erfolgreich");
        }
    }
}
