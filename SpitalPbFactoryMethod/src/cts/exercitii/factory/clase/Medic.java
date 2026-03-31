package cts.exercitii.factory.clase;

public class Medic implements PersonalSpital{

    String nume;
    double salariu;

    public Medic(String nume, double salariu) {
        this.nume = nume;
        this.salariu=salariu;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(this.nume+" este medic");
    }
}
