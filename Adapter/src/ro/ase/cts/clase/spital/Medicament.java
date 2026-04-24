package ro.ase.cts.clase.spital;

public class Medicament {
    private String numeMedicament;
    private double pretMedicament;

    public Medicament(String numeMedicament, double pretMedicament) {
        this.numeMedicament = numeMedicament;
        this.pretMedicament = pretMedicament;
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public void achizitioneazamedicament(){
        if (prezintaReteta()){
            System.out.println("E achizitionat medicamentul "+this.numeMedicament+" la pretul de "+this.pretMedicament);
        }
        else System.out.println("Pentru medicamentul "+this.numeMedicament+" este nevoie de reteta");
    }
    public boolean prezintaReteta(){
        return numeMedicament.contains("reteta");
    }
}
