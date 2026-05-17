package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        Operator operator=new Operator();
        Command comanda1=new Internare(new Pacient("Gigel",6));
        operator.adaugaComanda(comanda1);
        operator.executaComanda();
        operator.executaComanda();
        Command comanda2=new Tratare(new Pacient("Marcel",3));
        operator.adaugaComanda(comanda2);
        operator.executaComanda();
    }
}
