package ro.ase.cts.clase;

public class NotaDePlata implements INotaDePlata{
    private double suma;
    private String data;

    public NotaDePlata(double suma, String data) {
        this.suma = suma;
        this.data = data;
    }


    public String getData() {
        return data;
    }

    @Override
    public void printeaza() {
        System.out.println("A fost achitata nota de plata in suma de "+this.suma+" la data de "+this.data);
    }
}
