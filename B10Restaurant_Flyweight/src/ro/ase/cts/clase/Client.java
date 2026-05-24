package ro.ase.cts.clase;

public class Client implements IRezervare{
    private String nume;
    private String nrTelefon;
    private String email;

    public Client(String nume, String nrTelefon, String email) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

    @Override
    public void afiseazaetaliiRezervare(Masa masa) {
        System.out.println("Clientul "+this.nume+" are rezervare pentru masa numarul "+masa.getNrMasa()+" pentru "+masa.getNrPersoane()+" persoane la ora "+masa.getOra());
    }
}
