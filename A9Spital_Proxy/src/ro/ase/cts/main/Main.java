package ro.ase.cts.main;

import ro.ase.cts.clase.IInternare;
import ro.ase.cts.clase.InternareProxy;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.SistemInternare;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new Pacient("gigel",true);
        Pacient pac2=new Pacient("aana",false);
        IInternare internare=new SistemInternare();
        IInternare internareproxy=new InternareProxy(internare);
        internareproxy.internare(pacient);
        internareproxy.internare(pac2);
    }
}
