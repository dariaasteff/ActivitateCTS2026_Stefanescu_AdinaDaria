package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura {
    private String numeDepartament;
    private List<Structura> lista;

    public Departament(String numeDepartament) {
        this.numeDepartament = numeDepartament;
        this.lista=new ArrayList<>();
    }

    public void adaugaStructura(Structura s)
    {
        lista.add(s);
    }

    public void stergeStructura(Structura s)
    {
        lista.remove(s);
    }

    public Structura getStructura(int poz)
    {
        return lista.get(poz);
    }

    @Override
    public void afiseazaDetaliiStructura() {
        System.out.println("nume departamnet "+this.numeDepartament);
        for(Structura structura:lista)
        {
            structura.afiseazaDetaliiStructura();
        }

    }
}
