package ro.ase.cts.clase;

public class Linie implements LinieDeTransport{
    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    protected Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Linie{");
        sb.append("nrLinie=").append(nrLinie);
        sb.append(", primaStatie='").append(primaStatie).append('\'');
        sb.append(", ultimaStatie='").append(ultimaStatie).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaAutobuzLinie(Autobuz autobuz) {
        System.out.println(autobuz.toString());
        System.out.println(this.toString());
    }

    @Override
    public void afiseazaNrMaximCalatoriPerTraseu(Autobuz autobuz) {
        System.out.println("De la statia "+this.primaStatie+" pana la statia "
                +this.ultimaStatie+" pot merge maxim "+autobuz.getNrLocuri()+" calatori");
    }

}
