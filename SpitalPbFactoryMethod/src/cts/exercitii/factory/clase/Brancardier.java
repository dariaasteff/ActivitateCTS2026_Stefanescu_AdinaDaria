package cts.exercitii.factory.clase;

public class Brancardier implements PersonalSpital{
    String nume;

    public Brancardier(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(this.nume+" este brancardier");
    }
}
