package cts.exercitii.factory.main;

import cts.exercitii.factory.clase.Medic;
import cts.exercitii.factory.clase.PersonalSpital;
import cts.exercitii.factory.enums.PersonalMedical;
import cts.exercitii.factory.enums.PersonalNonMedical;
import cts.exercitii.factory.enums.TipPersonal;
import cts.exercitii.factory.fabrici.IPersonalSpital;
import cts.exercitii.factory.fabrici.PersonalMedicalFactory;
import cts.exercitii.factory.fabrici.PersonalNonMedicalFactory;

public class Main {
    public static void main(String[] args){
        IPersonalSpital fabricaPersonalMedical = new PersonalMedicalFactory();
        PersonalSpital medic= fabricaPersonalMedical.createInstance(PersonalMedical.Medic,"Gigel", 10000);


        IPersonalSpital fabricaPersonalNonMedical= new PersonalNonMedicalFactory();
        PersonalSpital secretar=fabricaPersonalNonMedical.createInstance(PersonalNonMedical.Secretar, "Marian",0);

        medic.afiseazaDetalii();
        secretar.afiseazaDetalii();
    }
}
