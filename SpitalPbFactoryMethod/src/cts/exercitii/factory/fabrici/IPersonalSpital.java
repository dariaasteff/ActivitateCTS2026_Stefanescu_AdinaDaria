package cts.exercitii.factory.fabrici;

import cts.exercitii.factory.clase.PersonalSpital;
import cts.exercitii.factory.enums.TipPersonal;

public interface IPersonalSpital {
    PersonalSpital createInstance(TipPersonal tip, String nume, double salariu);

}
