package ro.ase.cts.main;

import ro.ase.cts.clase.Bilet;
import ro.ase.cts.clase.BiletDecorator;
import ro.ase.cts.clase.BiletLaMultiAni;
import ro.ase.cts.clase.IBilet;

public class Main {
    public static void main(String[] args) {
        Bilet bilet=new Bilet("AUTOBUZ","1 ianuarie 2025-sarbatoare");
        Bilet bilet2=new Bilet("Metrou","3 septembrie 2025");
        Bilet bilet3=new Bilet("Trmavai","1 martie 2024-sarbatoare");
        BiletDecorator biletDecoractor;
        if(bilet.getData().contains("sarbatoare")){
            biletDecoractor=new BiletLaMultiAni(bilet);
            biletDecoractor.printeazaMesajCustomizat();
        }
        else bilet.printeaza();
        BiletDecorator biletDec2;
        if(bilet2.getData().contains("sarbatoare")){
            biletDec2=new BiletLaMultiAni(bilet2);
            biletDec2.printeazaMesajCustomizat();
        }
        else bilet2.printeaza();
    }
}
