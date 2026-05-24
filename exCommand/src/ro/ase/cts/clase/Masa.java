package ro.ase.cts.clase;

public class Masa {
    private int nrMasa;
    private int nrlocuri;

    public Masa(int nrMasa, int nrlocuri) {
        this.nrMasa = nrMasa;
        this.nrlocuri = nrlocuri;
    }

    public void ocupare()
    {
        System.out.println("Masa "+this.nrMasa+" este ocupata");
    }

    public void rezervare()
    {
        System.out.println("Masa "+this.nrMasa+" este rezervata");
    }

}
