package ro.ase.cts.factory;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.clase.SupaDeLegume;
import ro.ase.cts.clase.SupaDeVita;
import ro.ase.cts.enums.TipFeluriDeMancare;
import ro.ase.cts.enums.TipSupe;
public class SupeFactory implements FeluriDeMancareFactory{

    @Override
    public FelDeMancare creareFelDeMancare(TipFeluriDeMancare tip, int gramaj, double pret) {
        return switch (tip){
            case TipSupe.SupaDeLegume -> new SupaDeLegume(gramaj,pret);
            case TipSupe.SupaDeVita -> new SupaDeVita(gramaj, pret);
            default -> null;
        };
    }
    @Override
    public FelDeMancare creareFelDeMancare(TipFeluriDeMancare tipFelDeMancare, int gramaj, double pret, int calorii) {
        return creareFelDeMancare(tipFelDeMancare,gramaj,pret,500);
    }
}
