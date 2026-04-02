package cts.ex.clase;

public class AutobuzMic implements IAutobuz{
    String producator;
    String model;
    int nrLocuri;

    public AutobuzMic(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void afisareDetalii() {
        System.out.println(this.model+" este autobuz mic");
    }
}
