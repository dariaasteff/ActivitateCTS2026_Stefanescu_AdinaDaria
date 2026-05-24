package ro.ase.cts.clase;

public class Card implements MetodaPlata{


    @Override
    public void plateste() {
        System.out.println("S-a achitat card");
    }
}
