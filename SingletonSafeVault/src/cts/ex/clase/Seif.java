package cts.ex.clase;

import java.util.ArrayList;
import java.util.List;

public class Seif {
    private static Seif instance;
    private int codAcces;
    private List<String> parole=new ArrayList<>();

    private Seif() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Seif{");
        sb.append("codAcces=").append(codAcces);
        sb.append(", parole=").append(parole);
        sb.append('}');
        return sb.toString();
    }

    public static synchronized Seif getInstance(){
        if(instance==null)
            instance=new Seif();
        return instance;
    }

    public void adaugaParola(String parola)
    {
        parole.add(parola);
    }

    public void setCodAcces(int codAcces) {
        this.codAcces = codAcces;
    }
}
