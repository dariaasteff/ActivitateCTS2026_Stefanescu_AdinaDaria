package ro.ase.cts.clase;

public class Autobuz implements MijlocDeTransport {
    private String linie;
    private int nrCalatori;

    public Autobuz(String linie, int nrCalatori) {
        this.linie = linie;
        this.nrCalatori = nrCalatori;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    public String getLinie() {
        return linie;
    }

    @Override
    public void oprireInStatie() {
        System.out.println("Autobuzul "+ linie+" opreste in statie.");
    }
}
