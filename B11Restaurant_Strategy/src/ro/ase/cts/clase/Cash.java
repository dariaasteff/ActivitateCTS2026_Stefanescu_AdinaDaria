package ro.ase.cts.clase;

public class Cash implements MetodaPlata{
    @Override
    public void plateste() {
        System.out.println("S-a achitat cash");
    }
}
