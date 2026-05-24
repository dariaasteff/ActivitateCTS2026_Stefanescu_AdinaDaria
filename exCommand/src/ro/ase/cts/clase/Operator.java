package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> listaComenzi;

    public Operator() {
        this.listaComenzi=new ArrayList<>();
    }

    public void adaugaComanada(Command comanda)
    {
        listaComenzi.add(comanda);
    }

    public void executaComanda()
    {
        if(listaComenzi.size()>0)
        {
            listaComenzi.removeFirst().executa();
        }
        else System.out.println("Nu sunt comenzi de executat");
    }
}
