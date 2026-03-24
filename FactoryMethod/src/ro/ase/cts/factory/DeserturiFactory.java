package ro.ase.cts.factory;

import ro.ase.cts.clase.Clatite;
import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.clase.Papanasi;
import ro.ase.cts.enums.TipDeserturi;
import ro.ase.cts.enums.TipFeluriDeMancare;

public class DeserturiFactory implements FeluriDeMancareFactory{
    @Override
    public FelDeMancare creareFelDeMancare(TipFeluriDeMancare tipFelDeMancare, int gramaj, double pret) {
        return creareFelDeMancare(tipFelDeMancare,gramaj,pret,100);
    }

    @Override
    public FelDeMancare creareFelDeMancare(TipFeluriDeMancare tipFelDeMancare, int gramaj, double pret, int calorii) {
        return switch (tipFelDeMancare){
            case TipDeserturi.Papanasi -> new Papanasi(calorii,pret,gramaj);
            case TipDeserturi.Clatite -> new Clatite(calorii,pret,gramaj);
            default -> null;
        };
    }
}
