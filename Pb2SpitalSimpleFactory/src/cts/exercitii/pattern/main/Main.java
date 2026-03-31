package cts.exercitii.pattern.main;

import cts.exercitii.pattern.clase.Personal;
import cts.exercitii.pattern.fabrica.PersonalFactory;
import cts.exercitii.pattern.fabrica.PersonalType;

public class Main {
    public static void main(String[] args){
        Personal asistent=PersonalFactory.getPersonal(PersonalType.ASISTENT,"Marcel", 3);
        Personal medic=PersonalFactory.getPersonal(PersonalType.MEDIC, "Maricica", 12);
        asistent.afiseazaDetalii();
        medic.afiseazaDetalii();
    }
}
