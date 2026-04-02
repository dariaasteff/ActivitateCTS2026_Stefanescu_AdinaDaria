package cts.ex.clase;

import java.util.ArrayList;
import java.util.List;

public class Satelit {

    private static Satelit instance;
    private String numeSatelit;
    private List<String> mesaje=new ArrayList<>();

    private Satelit() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Satelit{");
        sb.append("numeSatelit='").append(numeSatelit).append('\'');
        sb.append(", mesaje=").append(mesaje);
        sb.append('}');
        return sb.toString();
    }

    public static synchronized Satelit getInstance(){
        if(instance==null)
            instance= new Satelit();
        return instance;
    }

    public void adaugaMesaj(String mesaj){
        mesaje.add(mesaj);
    }

    public void afisareMesaje()
    {
        System.out.println(mesaje);
    }

    public void setNumeSatelit(String numeSatelit) {
        this.numeSatelit = numeSatelit;
    }
}
