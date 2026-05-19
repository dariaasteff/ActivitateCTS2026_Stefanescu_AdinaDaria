package ro.ase.cts.clase;

public class Bilet implements IBilet {
    private String numeBilet;
    private String data;

    public Bilet(String numeBilet, String data) {
        this.numeBilet = numeBilet;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public void printeaza() {
        System.out.println("A fost printat biletul pentru "+this.numeBilet+" la data de "+this.data);
    }
}
