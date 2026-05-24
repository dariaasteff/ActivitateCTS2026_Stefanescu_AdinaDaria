package ro.ase.cts.main;

import ro.ase.cts.clase.ClientAbonat;
import ro.ase.cts.clase.IClient;
import ro.ase.cts.clase.IRestaurant;
import ro.ase.cts.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        IClient client1=new ClientAbonat("Marcel");
        IRestaurant restaurant1=new Restaurant("Cocosatul");
        restaurant1.adaugaClient(client1);
        restaurant1.trimiteNotificare("Oferta noua la carnea de vita!!");
    }
}
