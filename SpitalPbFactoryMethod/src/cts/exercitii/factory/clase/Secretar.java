package cts.exercitii.factory.clase;

public class Secretar implements PersonalSpital{
    String nume;

    public Secretar(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(this.nume+ " este secretar");
    }
}
