package ro.ase.cts.clase;

public class SistemInternare implements IInternare{
    @Override
    public void internare(Pacient pacient) {
        System.out.println("Pacientul "+pacient.getNume()+" a fost internat");
    }
}
