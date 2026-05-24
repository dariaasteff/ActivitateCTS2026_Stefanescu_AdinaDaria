package ro.ase.cts.clase;

public class Masa {
    private int nrMasa;
    private int nrPersoane;
    private String ora;

    public Masa(int nrMasa, int nrPersoane, String ora) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.ora = ora;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public String getOra() {
        return ora;
    }


}
