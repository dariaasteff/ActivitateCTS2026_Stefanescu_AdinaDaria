package ro.ase.cts.clase;

public class Pacient {
    private String nume;
    private int gravitate;

    public Pacient(String nume, int gravitate) {
        this.nume = nume;
        this.gravitate = gravitate;
    }

    public int getGravitate() {
        return gravitate;
    }

    public void internare()
    {
        System.out.println("Pacientul "+this.nume+ " este internat");
    }

    public void tratare()
    {
        System.out.println("Pacientul "+this.nume+" este tratat imediat.");
    }
}
