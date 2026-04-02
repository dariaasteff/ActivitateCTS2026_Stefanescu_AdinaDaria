package cts.ex.fabrica;

import cts.ex.clase.AutobuzMare;
import cts.ex.clase.AutobuzMediu;
import cts.ex.clase.AutobuzMic;
import cts.ex.clase.IAutobuz;

public class Grupa {
    public static IAutobuz getGrupa(TipAutobuz tip, String producator, String model, int nr){
        switch(tip){
            case TipAutobuz.MARE: return new AutobuzMare(producator, model, nr);
            case TipAutobuz.MEDIU: return  new AutobuzMediu(producator, model, nr);
            case TipAutobuz.MIC: return new AutobuzMic(producator, model, nr);
            default:return null;
        }
    }
}
