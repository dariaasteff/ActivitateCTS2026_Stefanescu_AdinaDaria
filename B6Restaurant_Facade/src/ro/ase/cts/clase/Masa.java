package ro.ase.cts.clase;

public class Masa {
    private int nrMasa;
    private boolean esteLibera;
    private boolean esteDebarasata;
    private boolean areServetele;

    public Masa(int nrMasa, boolean esteLibera, boolean esteDebarasata, boolean areServetele) {
        this.nrMasa = nrMasa;
        this.esteLibera = esteLibera;
        this.esteDebarasata = esteDebarasata;
        this.areServetele = areServetele;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public boolean isEsteDebarasata() {
        return esteDebarasata;
    }

    public boolean isAreServetele() {
        return areServetele;
    }
}
