package ro.ase.cts.clase;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

public class Sectiune implements StructuraMeniu{
    private String denumire;
    private List<StructuraMeniu> listaSubsectiuni;

    public Sectiune(String denumire) {
        this.denumire = denumire;
        this.listaSubsectiuni=new ArrayList<>();
    }

    public void adaugaSubsectiune(StructuraMeniu s)
    {
        listaSubsectiuni.add(s);
    }

    public StructuraMeniu getSubsectiune(int poz)
    {
        return listaSubsectiuni.get(poz);
    }


    @Override
    public void afiseazaDetaliiStructura() {
        System.out.println("Sectiunea "+this.denumire+" are urmatoarele produse: ");
        for(StructuraMeniu s:listaSubsectiuni)
            s.afiseazaDetaliiStructura();
    }
}
