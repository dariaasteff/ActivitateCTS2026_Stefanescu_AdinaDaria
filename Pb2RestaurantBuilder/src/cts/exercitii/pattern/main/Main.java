package cts.exercitii.pattern.main;

import cts.exercitii.pattern.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1= new Rezervare.RezervareBuilder(3).setDecorareMasa(true).build();
        System.out.println(rezervare1);
    }
}
