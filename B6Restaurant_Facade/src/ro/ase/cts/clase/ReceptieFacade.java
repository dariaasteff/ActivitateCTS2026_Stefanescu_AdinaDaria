package ro.ase.cts.clase;

public class ReceptieFacade {
    private GestiuneMese gestiuneMese;
    private ServiciuCuratenie curatenie;
    private ServicviuAranjare aranjare;

    public ReceptieFacade() {
        this.gestiuneMese=new GestiuneMese();
        this.curatenie=new ServiciuCuratenie();
        this.aranjare=new ServicviuAranjare();
    }

    public void esteMasaPregatita(Masa masa){
        if(gestiuneMese.esteMasaLibera(masa))
        {
            if(curatenie.esteMasaDebarasata(masa))
            {
                if(aranjare.suntServetele(masa))
                    System.out.println("Masa" +masa.getNrMasa()+" este pregatita");
                else System.out.println("masa "+masa.getNrMasa()+" nu are servetele");
            }
            else System.out.println("Masa "+masa.getNrMasa()+" nu a fost debarasata");
        }
        else System.out.println("Masa "+masa.getNrMasa()+" este ocupata");
    }
}
