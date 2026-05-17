package ro.ase.cts.clase;

public class Calator {
    private int nrLinie;
    private MetodaPlata metodaPlata;

    public Calator(int nrLinie) {
        this.nrLinie = nrLinie;
        metodaPlata=new CardDeCalatorie();
    }

    public Calator(int nrLinie, MetodaPlata metodaPlata) {
        this.nrLinie = nrLinie;
        this.metodaPlata = metodaPlata;
    }

    public void setMetodaPlata(MetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void plata()
    {
        metodaPlata.plataCalatorie();
    }
}
