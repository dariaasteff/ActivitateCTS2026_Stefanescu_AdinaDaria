package ro.ase.cts.clase;

public class Rezervare implements Command{
    private Masa masa;

    public Rezervare(Masa masa) {
        this.masa = masa;
    }

    @Override
    public void executa() {
        this.masa.rezervare();
    }
}
