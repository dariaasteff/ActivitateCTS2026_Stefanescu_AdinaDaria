package ro.ase.cts.main;

import ro.ase.cts.clase.Departament;
import ro.ase.cts.clase.Sectie;
import ro.ase.cts.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura depFinanciar=new Departament("Financiar");
        Structura depConta=new Departament("Contabilitate");
        Structura sectieCibernetica=new Sectie("Cibernetica",14);
        ((Departament)depConta).adaugaStructura(sectieCibernetica);
        ((Departament)depFinanciar).adaugaStructura(depConta);
        depFinanciar.afiseazaDetaliiStructura();
    }
}
