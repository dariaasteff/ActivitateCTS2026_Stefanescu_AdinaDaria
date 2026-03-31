package cts.exercitii.factory.clase;

public class Registrator implements PersonalSpital{
    String nume;

    public Registrator(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(this.nume+" este registrator");
    }
}
