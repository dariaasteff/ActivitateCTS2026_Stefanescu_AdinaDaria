package ro.ase.cts.clase;

public class Internare implements Command{
    private Pacient pacient;

    public Internare(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        if(pacient.getGravitate()>5)
            pacient.internare();
        else pacient.tratare();
    }
}
