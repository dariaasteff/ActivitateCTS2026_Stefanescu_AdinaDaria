package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.AutobuzCursaSpeciala;
import ro.ase.cts.clase.AutobuzDeNoapte;
import ro.ase.cts.clase.MijlocDeTransport;

public class Main {
    public static void main(String[] args) {
        MijlocDeTransport autobuz= new Autobuz("385",4);
        autobuz.oprireInStatie();
        autobuz.oprireInStatie();
        MijlocDeTransport autobuzDeNoapte=new AutobuzDeNoapte(autobuz);
        MijlocDeTransport autobuz2=new Autobuz("123", 0);
        MijlocDeTransport autobuzNoapte2=new AutobuzDeNoapte(autobuz2);
        autobuzNoapte2.oprireInStatie();
        autobuz2.oprireInStatie();
        MijlocDeTransport autobuz3=new Autobuz("cursa speciala", 12);
        MijlocDeTransport autobuzSpecial=new AutobuzCursaSpeciala(autobuz3);
        autobuzSpecial.oprireInStatie();

    }
}
