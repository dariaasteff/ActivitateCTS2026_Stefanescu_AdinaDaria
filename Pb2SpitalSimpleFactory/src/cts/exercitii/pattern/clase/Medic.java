package cts.exercitii.pattern.clase;

public class Medic implements Personal{

    String nume;
    int vechime;

    public Medic(String nume, int vechime) {
        this.nume = nume;
        this.vechime = vechime;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(this.nume+" este medic");
    }
}
