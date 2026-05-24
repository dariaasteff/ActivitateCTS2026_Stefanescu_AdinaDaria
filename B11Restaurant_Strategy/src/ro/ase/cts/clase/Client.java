package ro.ase.cts.clase;

public class Client {
    private String nume;
    private MetodaPlata metodaPlata;

    public Client(String nume) {
        this.nume = nume;
        this.metodaPlata=new Card();
    }

    public String getNume() {
        return nume;
    }

    public Client(String nume, MetodaPlata metodaPlata) {
        this.nume = nume;
        this.metodaPlata=metodaPlata;
    }

    public void setMetodaPlata(MetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void achitaNota()
    {
        System.out.println("Clientul "+this.nume);
        metodaPlata.plateste();
    }

}
