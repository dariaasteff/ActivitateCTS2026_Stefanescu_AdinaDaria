package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        Operator operator=new Operator();
        Command comanda1=new Rezervare(new Masa(12));
        Command comanda2=new Ocupare(new Masa(5));
        operator.adaugaComanda(comanda1);
        operator.adaugaComanda(comanda2);
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
