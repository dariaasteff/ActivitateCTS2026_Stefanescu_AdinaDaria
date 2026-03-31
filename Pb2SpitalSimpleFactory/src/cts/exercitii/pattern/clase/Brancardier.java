package cts.exercitii.pattern.clase;

public class Brancardier implements Personal{
    String nume;
    int  vechime;

    public Brancardier(String nume, int vechime) {
        this.nume = nume;
        this.vechime = vechime;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(this.nume+" este brancardier");
    }
}
