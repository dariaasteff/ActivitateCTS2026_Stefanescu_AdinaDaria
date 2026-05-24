package ro.ase.cts.main;

import ro.ase.cts.clase.Item;
import ro.ase.cts.clase.Sectiune;
import ro.ase.cts.clase.StructuraMeniu;

public class Main {
    public static void main(String[] args) {
        StructuraMeniu sectiuneAperitiv=new Sectiune("Aperitiv");
        StructuraMeniu cascaval=new Item("cascaval",18);
        StructuraMeniu salam=new Item("salam",15.6);
        ((Sectiune)sectiuneAperitiv).adaugaSubsectiune(cascaval);
        ((Sectiune)sectiuneAperitiv).adaugaSubsectiune(salam);
        sectiuneAperitiv.afiseazaDetaliiStructura();

    }
}
