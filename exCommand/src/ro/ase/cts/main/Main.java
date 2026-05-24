package ro.ase.cts.main;

import ro.ase.cts.clase.Command;
import ro.ase.cts.clase.Masa;
import ro.ase.cts.clase.Ocupare;
import ro.ase.cts.clase.Operator;

public class Main {
    public static void main(String[] args) {
        Masa masa1=new Masa(12,5);
        Command comanada1=new Ocupare(masa1);
        Operator operator=new Operator();
        operator.adaugaComanada(comanada1);
        operator.executaComanda();
        operator.executaComanda();
    }
}
