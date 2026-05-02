package ro.ase.cts.clase;

public class AutobuzDeNoapte implements MijlocDeTransport{
    private MijlocDeTransport mijlocTransport;

    public AutobuzDeNoapte(MijlocDeTransport mijlocTransport) {
        this.mijlocTransport = mijlocTransport;
    }

    @Override
    public void oprireInStatie() {
        if(getNrCalatori()>0){
            mijlocTransport.oprireInStatie();
        }
        else {
            System.out.println("Autobuzul nu are calatori, se retrage la autobaza.");
        }
    }

    @Override
    public int getNrCalatori() {
        return mijlocTransport.getNrCalatori();
    }

    @Override
    public String getLinie() {
        return mijlocTransport.getLinie();
    }
}
