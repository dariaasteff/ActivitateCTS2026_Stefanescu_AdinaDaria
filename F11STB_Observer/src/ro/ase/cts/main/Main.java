package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.Calator;
import ro.ase.cts.clase.CalatorInregistrat;
import ro.ase.cts.clase.IAutobuz;

public class Main {
    public static void main(String[] args) {
        IAutobuz autobuz=new Autobuz("123");
        Calator c1=new CalatorInregistrat("Marcel");
        autobuz.inregistreazaCalator(c1);
        ((Autobuz)autobuz).notificaPlecare();

    }
}
