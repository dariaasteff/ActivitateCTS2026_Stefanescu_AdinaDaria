package cts.exercitii.factory.fabrici;

import cts.exercitii.factory.clase.PersonalSpital;
import cts.exercitii.factory.clase.Registrator;
import cts.exercitii.factory.clase.Secretar;
import cts.exercitii.factory.enums.PersonalNonMedical;
import cts.exercitii.factory.enums.TipPersonal;

public class PersonalNonMedicalFactory implements IPersonalSpital{
    @Override
    public PersonalSpital createInstance(TipPersonal tip, String nume, double salariu) {
        switch(tip){
            case PersonalNonMedical.Registrator: return new Registrator(nume);
            case PersonalNonMedical.Secretar: return new Secretar(nume);
            default: return null;
        }
    }
}
