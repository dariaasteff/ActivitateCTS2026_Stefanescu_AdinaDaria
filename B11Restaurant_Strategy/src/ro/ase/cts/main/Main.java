package ro.ase.cts.main;

import ro.ase.cts.clase.Card;
import ro.ase.cts.clase.Cash;
import ro.ase.cts.clase.Client;

public class Main {
    public static void main(String[] args) {
        Client client1=new Client("Ionica");
        Client client2=new Client("Gigel",new Cash());
        client1.achitaNota();
        client2.achitaNota();
        client1.setMetodaPlata(new Cash());
        client1.achitaNota();
    }
}
