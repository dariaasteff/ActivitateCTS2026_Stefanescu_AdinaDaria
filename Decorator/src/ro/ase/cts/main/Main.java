package ro.ase.cts.main;

import ro.ase.cts.clase.NotaDePlata;
import ro.ase.cts.clase.NotaDePlata1Mai;
import ro.ase.cts.clase.NotaDePlataDecorator;

public class Main {
    public static void main(String[] args) {
        NotaDePlata nota=new NotaDePlata(234.5, "1 mai 2024");
        nota.printeaza();
        NotaDePlataDecorator notaD;
        if(nota.getData().contains("1 mai")) {
            notaD = new NotaDePlata1Mai(nota);
            notaD.printeazafelicitare();
        }

    }
}
