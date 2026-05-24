package ro.ase.cts.clase;

public class Masa {
    private int nrMasa;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public void ocupare(){
        System.out.println("Masa "+this.nrMasa+" este ocupata");
    }

    public void rezervare()
    {
        System.out.println("Masa "+this.nrMasa+" este rezervata");
    }
}
