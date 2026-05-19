package ro.ase.cts.clase;

public class Rezervare implements IRezervare{
    @Override
    public void rezerva(Client client) {
        System.out.println("Clientul "+client.getNume()+" a rezervat o masa.");
    }
}
