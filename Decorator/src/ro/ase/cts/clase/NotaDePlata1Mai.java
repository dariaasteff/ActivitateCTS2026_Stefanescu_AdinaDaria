package ro.ase.cts.clase;

public class NotaDePlata1Mai extends NotaDePlataDecorator{
    public NotaDePlata1Mai(INotaDePlata nota) {
        super(nota);
    }

    @Override
    public void printeazafelicitare() {
        System.out.println("La multi ani de 1 mai!");
    }
}
