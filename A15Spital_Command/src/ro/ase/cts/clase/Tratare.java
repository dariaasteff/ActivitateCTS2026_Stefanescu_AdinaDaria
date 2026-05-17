package ro.ase.cts.clase;

public class Tratare implements Command{
    private Pacient pacient;

    public Tratare(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        if(pacient.getGravitate()>5)
            pacient.internare();
        else pacient.tratare();
    }
}
