package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class ClientFactory {
    public Map<String,Client> colectieClienti=new HashMap<>();

    public Client getClient(String nume, String nrTelefon, String email){
        if(colectieClienti.containsKey(nume))
            return colectieClienti.get(nume);
        else {
            Client client=new Client(nume, nrTelefon, email);
            colectieClienti.put(nume, client);
            return client;
        }
    }
}
