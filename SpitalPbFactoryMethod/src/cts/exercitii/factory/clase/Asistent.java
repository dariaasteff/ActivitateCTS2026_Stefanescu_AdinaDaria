package cts.exercitii.factory.clase;

public class Asistent implements PersonalSpital{
    String nume;

    public Asistent(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(this.nume+" este asistent");
    }
}
