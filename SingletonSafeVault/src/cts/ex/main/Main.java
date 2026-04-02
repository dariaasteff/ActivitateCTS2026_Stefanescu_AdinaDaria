package cts.ex.main;

import cts.ex.clase.Seif;

public class Main {
    public static void main(String[] args) {
        Seif s1= Seif.getInstance();
        s1.adaugaParola("gica si ana");
        s1.setCodAcces(123);
        Seif s2=Seif.getInstance();
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
