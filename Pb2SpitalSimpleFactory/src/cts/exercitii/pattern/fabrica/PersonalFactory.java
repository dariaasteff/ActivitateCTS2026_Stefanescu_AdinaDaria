package cts.exercitii.pattern.fabrica;

import cts.exercitii.pattern.clase.Asistent;
import cts.exercitii.pattern.clase.Brancardier;
import cts.exercitii.pattern.clase.Medic;
import cts.exercitii.pattern.clase.Personal;

public class PersonalFactory {

    public static Personal getPersonal(PersonalType tip, String nume, int vechime){
        switch(tip){
            case PersonalType.ASISTENT: return new Asistent(nume, vechime);
            case PersonalType.BRANCARDIER: return new Brancardier(nume, vechime);
            case PersonalType.MEDIC: return new Medic(nume, vechime);
            default: return null;
        }
    }
}
