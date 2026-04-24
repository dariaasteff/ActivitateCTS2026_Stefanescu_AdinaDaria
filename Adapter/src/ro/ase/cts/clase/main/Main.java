package ro.ase.cts.clase.main;

import ro.ase.cts.clase.spital.Medicament;
import ro.ase.cts.clase.spital.MedicamentAdapter;

public class Main {
    private static void procuraMedicament(ro.ase.cts.clase.farmacie.Medicament medicament){
        medicament.cumparaReteta();
    }
    public static void main(String[] args) {
        Medicament medicamentSpital= new Medicament("Cefort-reteta", 30);
        ro.ase.cts.clase.farmacie.Medicament medicamentFarmacie= new ro.ase.cts.clase.farmacie.Medicament("Nurofen");
        medicamentSpital.achizitioneazamedicament();
        medicamentFarmacie.cumparaReteta();
        procuraMedicament(medicamentFarmacie);
        //procuraMedicament(medicamentSpital);
        MedicamentAdapter adaptor= new MedicamentAdapter(medicamentSpital);
        procuraMedicament(adaptor);


    }
}
