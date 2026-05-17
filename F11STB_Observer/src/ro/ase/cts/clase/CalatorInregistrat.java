package ro.ase.cts.clase;

public class CalatorInregistrat implements Calator{
    String nume;

    public CalatorInregistrat(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println("Calatorul "+this.nume+" a primit notificare cu mesajul "+mesaj);
    }
}
