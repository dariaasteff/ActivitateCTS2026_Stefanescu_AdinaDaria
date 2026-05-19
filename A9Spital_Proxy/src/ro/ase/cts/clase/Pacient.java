package ro.ase.cts.clase;

public class Pacient {
    private String nume;
    private boolean areCardSanatate;

    public Pacient(String nume, boolean areCardSanatate) {
        this.nume = nume;
        this.areCardSanatate = areCardSanatate;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreCardSanatate() {
        return areCardSanatate;
    }
}
