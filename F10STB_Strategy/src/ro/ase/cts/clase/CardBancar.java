package ro.ase.cts.clase;

public class CardBancar implements MetodaPlata{
    @Override
    public void plataCalatorie() {
        System.out.println("Calatoria a fost platita prin card bancar.");
    }
}
