package ro.ase.cts.main;

import ro.ase.cts.clase.Calator;
import ro.ase.cts.clase.CardBancar;
import ro.ase.cts.clase.SMS;

public class Main {
    public static void main(String[] args) {
        Calator c1= new Calator(123);
        c1.setMetodaPlata(new SMS());
        c1.plata();

        Calator c2=new Calator(385,new CardBancar());
        c2.plata();
        Calator c3=new Calator(41);
        c3.plata();
    }
}
