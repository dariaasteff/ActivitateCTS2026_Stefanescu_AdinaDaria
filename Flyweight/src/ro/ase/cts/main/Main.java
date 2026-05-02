package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.LinieFactory;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz("electric",2009,30);
        Autobuz autobuz2=new Autobuz("hibrid", 2019,23);
        Autobuz autobuz3=new Autobuz("rapid", 2015,20);
        LinieFactory linieFactory=new LinieFactory();
        linieFactory.getLinie(102,"CFR", "Pantelimon").afiseazaAutobuzLinie(autobuz);
        linieFactory.getLinie(103,"Romana","Universitate").afiseazaAutobuzLinie(autobuz2);
        linieFactory.getLinie(102,"Maguricea", "Pod Ciurel").afiseazaAutobuzLinie(autobuz3);
    }
}
