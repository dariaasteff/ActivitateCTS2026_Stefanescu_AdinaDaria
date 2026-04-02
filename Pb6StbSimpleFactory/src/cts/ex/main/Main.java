package cts.ex.main;

import cts.ex.clase.IAutobuz;
import cts.ex.fabrica.Grupa;
import cts.ex.fabrica.TipAutobuz;

public class Main {
    public static void main(String[] args) {
        IAutobuz a1= Grupa.getGrupa(TipAutobuz.MARE, "IMPORT BOLIDE SRL", "BMW", 60);
        IAutobuz a2=Grupa.getGrupa(TipAutobuz.MIC, "MERCEDES", "MERCEDES", 20);
        a1.afisareDetalii();
        a2.afisareDetalii();
    }
}
