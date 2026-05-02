package ro.ase.cts.clase;

public class AutobuzCursaSpeciala implements MijlocDeTransport{
    private MijlocDeTransport mijlocDeTransport;

    public AutobuzCursaSpeciala(MijlocDeTransport mijlocDeTransport) {
        this.mijlocDeTransport = mijlocDeTransport;
    }

    @Override
    public void oprireInStatie() {
        if(mijlocDeTransport.getLinie().contains("speciala")){
            System.out.println("Autobuzul este intr-o cursa speciala.");
        }
        else{
            mijlocDeTransport.oprireInStatie();
        }
    }

    @Override
    public int getNrCalatori() {
        return mijlocDeTransport.getNrCalatori();
    }

    @Override
    public String getLinie() {
        return mijlocDeTransport.getLinie();
    }
}
