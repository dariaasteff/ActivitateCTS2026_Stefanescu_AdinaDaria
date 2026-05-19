package ro.ase.cts.clase;

public abstract class BiletDecorator implements IBilet {
    IBilet bilet;

    public BiletDecorator(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeaza() {
        bilet.printeaza();
    }
    public abstract void printeazaMesajCustomizat();
}
