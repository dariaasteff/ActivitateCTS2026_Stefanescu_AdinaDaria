package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.ClientFactory;
import ro.ase.cts.clase.Masa;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("Marcel", "0000", "@gigel");
        Masa masa=new Masa(12,5,"18:30");
        Masa masa2=new Masa(10,3,"13");
        client.afiseazaetaliiRezervare(masa2);
        ClientFactory factory=new ClientFactory();
        factory.getClient("Gigel","0000","@gigi").afiseazaetaliiRezervare(masa);

    }

}
