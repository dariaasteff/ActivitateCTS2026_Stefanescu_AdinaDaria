package ro.ase.cts.main;

import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.ReceptieSpital;
import ro.ase.cts.clase.Salon;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new Pacient("Ionica",7);
        Pacient pacient1=new Pacient("Gica", 3);
        Pacient pacient2= new Pacient("Alex", 8);
        Pacient pacien3=new Pacient("Maricica", 5);
        Medic medic=new Medic();
        Salon salon=new Salon();

        if(pacient.getGravitate()>6){
            if(medic.areInregistratPacientul(pacient)){
                int nrPatLibere= salon.getPatLiber();
                if(nrPatLibere!=-1){
                    System.out.println("Pacientul "+pacient.getNume()+" este internat in patul "+nrPatLibere);
                    salon.ocupaPat(nrPatLibere);
                }
            }
        }

        ReceptieSpital spital = new ReceptieSpital(medic, salon);
        spital.internarePacient(pacient1);
        spital.internarePacient(pacient2);
        spital.internarePacient(pacien3);
    }
}
