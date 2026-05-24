package ro.ase.cts.clase;

public class ClientAbonat implements IClient{
    private String nume;

    public ClientAbonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Clientul "+this.nume+" a primit o notificare cu mesajul "+mesaj);
    }
}
