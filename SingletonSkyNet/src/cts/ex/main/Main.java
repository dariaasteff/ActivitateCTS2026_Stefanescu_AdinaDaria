package cts.ex.main;

import cts.ex.clase.Satelit;

public class Main {
    public static void main(String[] args) {
        Satelit s1=Satelit.getInstance();
        s1.adaugaMesaj("MERGE");
        s1.afisareMesaje();
        Satelit s2=Satelit.getInstance();
        s2.setNumeSatelit("Hail Mary");
        s2.afisareMesaje();
        System.out.println(s2.toString());
    }
}
