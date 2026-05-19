package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.IRezervare;
import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.RezervareProxy;

public class Main {
    public static void main(String[] args) {
        Client client1=new Client("Gica",6);
        Client cleint2=new Client("Marian",2);
        IRezervare rezervare=new Rezervare();
        IRezervare rezrvareProxy=new RezervareProxy(rezervare);
        rezrvareProxy.rezerva(client1);
        rezrvareProxy.rezerva(cleint2);
    }
}
