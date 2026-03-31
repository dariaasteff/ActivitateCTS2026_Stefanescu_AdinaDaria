package cts.exercitii.factory.fabrici;

import cts.exercitii.factory.clase.Asistent;
import cts.exercitii.factory.clase.Brancardier;
import cts.exercitii.factory.clase.Medic;
import cts.exercitii.factory.clase.PersonalSpital;
import cts.exercitii.factory.enums.PersonalMedical;
import cts.exercitii.factory.enums.TipPersonal;

public class PersonalMedicalFactory implements IPersonalSpital{
    @Override
    public PersonalSpital createInstance(TipPersonal tip, String nume, double salariu) {
        switch(tip){
            case PersonalMedical.Medic: return new Medic(nume, salariu);
            case PersonalMedical.Asistent: return new Asistent(nume);
            case PersonalMedical.Brancardier: return new Brancardier(nume);
            default: return null;
        }
    }
}
