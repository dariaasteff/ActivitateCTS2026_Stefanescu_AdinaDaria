package ro.ase.cts.lazy;

public class Hotel {
    private String denumireHotel;
    private int nrCamere;
    private int nrCamereInchiriate;
    private int nrAngajatil;

    public void afisareInchiriereCamere(){
        if(nrCamereInchiriate!=nrCamere){
        System.out.println("Camera a fost inchiriata. ");
        nrCamereInchiriate++;
        }
        else System.out.printf("Nu mai sunt camere libere. ");
    }
    public void afisareDescriere(){
        StringBuilder sb = new StringBuilder();
        sb.append(denumireHotel);
        sb.append(nrCamere);
        sb.append(nrCamereInchiriate);
        sb.append(nrAngajatil);
        System.out.println(sb.toString());
    }

    private static  Hotel instanta=null;

    public Hotel(String denumireHotel, int nrCamere, int nrAngajatil) {
        this.denumireHotel = denumireHotel;
        this.nrCamere = nrCamere;
        this.nrCamereInchiriate=0;
        this.nrAngajatil = nrAngajatil;
    }

    public static synchronized Hotel getInstance(String denumireHotel, int nrCamere, int nrAngajatil){
        if(instanta==null)
        {
            instanta=new Hotel(denumireHotel, nrCamere,  nrAngajatil);
        }
        return instanta;
    }
}
