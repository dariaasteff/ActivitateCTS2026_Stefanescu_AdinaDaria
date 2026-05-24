package ro.ase.cts.clase;

public class Item implements StructuraMeniu{
    private String denumireProdsu;
    private double pret;

    public Item(String denumireProdsu, double pret) {
        this.denumireProdsu = denumireProdsu;
        this.pret = pret;
    }

    @Override
    public void afiseazaDetaliiStructura() {
        System.out.println("Produsul "+this.denumireProdsu+" costa "+this.pret);
    }
}
