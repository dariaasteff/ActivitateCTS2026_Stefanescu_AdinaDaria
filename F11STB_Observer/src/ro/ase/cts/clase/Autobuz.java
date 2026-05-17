package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements IAutobuz{
    private String nrLinie;
    private List<Calator> listaCalatori;

    public Autobuz(String nrLinie) {
        this.nrLinie = nrLinie;
        listaCalatori=new ArrayList<>();
    }

    @Override
    public void inregistreazaCalator(Calator calator) {
       listaCalatori.add(calator);
    }

    @Override
    public void notificaCalator(String mesaj) {
        listaCalatori.forEach(calator1 -> calator1.receptioneazaNotificare("Autobuzul de pe linia "+this.nrLinie+mesaj));
    }

    public void notificaPlecare()
    {
        this.notificaCalator(" a plecat din capatul liniei.");
    }

}
