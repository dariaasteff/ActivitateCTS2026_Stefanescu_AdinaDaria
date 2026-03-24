package ro.ase.cts.factory;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.enums.TipFeluriDeMancare;

public interface FeluriDeMancareFactory {
    FelDeMancare creareFelDeMancare(TipFeluriDeMancare tipFelDeMancare, int gramaj, double pret);
    FelDeMancare creareFelDeMancare(TipFeluriDeMancare tipFelDeMancare, int gramaj, double pret, int calorii);




}
