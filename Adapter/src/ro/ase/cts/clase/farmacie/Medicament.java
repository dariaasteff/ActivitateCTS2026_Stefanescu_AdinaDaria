package ro.ase.cts.clase.farmacie;

public class Medicament {
    private String numeMedicament;

    public Medicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public void cumparaReteta(){
        System.out.println("A fost cumparat medicamentul "+this.numeMedicament+" de la farmacie");
    }
}
