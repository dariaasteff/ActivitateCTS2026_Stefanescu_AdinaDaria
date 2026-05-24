package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{
    private String nume;
    private List<IClient> listaClienti;

    public Restaurant(String nume) {
        this.nume = nume;
        this.listaClienti=new ArrayList<>();
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        listaClienti.forEach(iClient -> iClient.primesteNotificare("Restaurantul"+this.nume+" a trimit mesajul "+mesaj));
    }

    @Override
    public void adaugaClient(IClient client) {
        listaClienti.add(client);
    }
}
