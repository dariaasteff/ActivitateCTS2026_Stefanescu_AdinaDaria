package ro.ase.cts.clase;

public class BiletLaMultiAni extends BiletDecorator{
    public BiletLaMultiAni(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void printeazaMesajCustomizat() {
        System.out.println("La multi ani");
    }
}
