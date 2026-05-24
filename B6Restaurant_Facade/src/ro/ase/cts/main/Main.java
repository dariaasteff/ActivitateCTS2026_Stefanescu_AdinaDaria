package ro.ase.cts.main;

import ro.ase.cts.clase.GestiuneMese;
import ro.ase.cts.clase.Masa;
import ro.ase.cts.clase.ReceptieFacade;

public class Main {
    public static void main(String[] args) {
        ReceptieFacade facade=new ReceptieFacade();
        Masa masa1=new Masa(12,true, true, false);
        Masa masa2=new Masa(10,true, true, true);
        Masa masa3=new Masa(6,false, false, false);
        facade.esteMasaPregatita(masa1);
        facade.esteMasaPregatita(masa2);
        facade.esteMasaPregatita(masa3);

    }
}
