package ro.ase.cts.clase;

public abstract class Aplicant {
    private static int punctajMinim = 80;

    public static void setPunctajMinim(int punctajMinim) {
        Aplicant.punctajMinim = punctajMinim;
    }

    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int nrProiecte;
    protected String[] denumireProiect;


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void afisareStatut() {
        StringBuilder sb = new StringBuilder("Aplicantul");
        sb.append(this.nume).append(this.prenume);
        sb.append((this.punctaj > Aplicant.punctajMinim?" ":" nu"));
        sb.append("a fost acceptat.");
        System.out.println(sb.toString());
    }

    public int getPunctaj() {
        return punctaj;
    }

    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }


    public Aplicant() {
        super();
    }

    public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect) {
        super();
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.nrProiecte = nrProiecte;
        this.denumireProiect = denumireProiect;
    }

    public int getNrProiecte() {
        return nrProiecte;
    }

    public void setNrProiecte(int nrProiecte, String[] vect) {

        this.nrProiecte = nrProiecte;
        this.denumireProiect = vect;
    }

    public abstract void afisareFinantare();


}
