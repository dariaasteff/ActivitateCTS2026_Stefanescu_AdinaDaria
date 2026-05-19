package ro.ase.cts.clase;

public class InternareProxy implements IInternare{
    private IInternare internare;

    public InternareProxy(IInternare internare) {
        this.internare = internare;
    }

    @Override
    public void internare(Pacient pacient) {
        if(pacient.isAreCardSanatate()){
            internare.internare(pacient);}
        else
            System.out.println("pacientul nu se poate interna, nu are card");

    }
}
