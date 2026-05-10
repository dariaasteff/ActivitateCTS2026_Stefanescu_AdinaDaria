package ro.ase.cts.main;

import ro.ase.cts.clase.ISpital;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.PacientAbonat;
import ro.ase.cts.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1=new PacientAbonat("Ion", 31);
        Pacient pacient2=new PacientAbonat("Maria", 27);
        Pacient pacient3=new PacientAbonat("Alexandru", 34);
        ISpital spital=new Spital("Obregia");
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);
        ((Spital)spital).notificaVirus();
        System.out.println("///");
        ((Spital)spital).notificaPandemie();
    }
}
