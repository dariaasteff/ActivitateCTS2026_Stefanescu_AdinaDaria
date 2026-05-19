package ro.ase.cts.clase;

public class RezervareProxy implements IRezervare{
    IRezervare rezervare;

    public RezervareProxy(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(Client client) {
        if(client.getNrPersoane()>=4){
            rezervare.rezerva(client);
        }
        else System.out.println("Nu se poate realiza rezervare, sunt prea putine persoane");
    }
}
