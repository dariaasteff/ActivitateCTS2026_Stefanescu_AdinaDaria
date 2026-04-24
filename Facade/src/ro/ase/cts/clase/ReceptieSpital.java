package ro.ase.cts.clase;

public class ReceptieSpital {
    private Medic medic;
    private Salon salon;

    public ReceptieSpital(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }
    public void internarePacient(Pacient pacient){
        if(pacient.getGravitate()>4){
            if(medic.areInregistratPacientul(pacient)){
                int nrPatLibere= salon.getPatLiber();
                if(nrPatLibere!=-1){
                    System.out.println("Pacientul "+pacient.getNume()+" este internat in patul "+nrPatLibere);
                    salon.ocupaPat(nrPatLibere);
                }
                else {
                    System.out.println("Nu exista paturi libere");
                }
            }
            else {
                System.out.println("Trebuie trimitere la medic");
            }
        }
        else{
            System.out.println("Starea pacientului nu e grava");
        }
    }
}
