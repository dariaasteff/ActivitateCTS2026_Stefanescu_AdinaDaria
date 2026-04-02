package cts.ex.main;

import cts.ex.clase.Internet;
import cts.ex.clase.Registry;
import cts.ex.clase.RoboticArmConnection;
import cts.ex.clase.Temperatura;

public class Main {
    public static void main(String[] args) {
        Registry.register("internet", new Internet());
        Registry.register("temperatura", new Temperatura());

        RoboticArmConnection c1=Registry.getConnection("internet");
        c1.afiseazaDetalii();
    }
}
