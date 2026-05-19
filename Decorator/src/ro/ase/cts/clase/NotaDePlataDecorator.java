package ro.ase.cts.clase;

public abstract class NotaDePlataDecorator implements INotaDePlata{
    private INotaDePlata nota;

    public NotaDePlataDecorator(INotaDePlata nota) {
        this.nota = nota;
    }

    @Override
    public void printeaza() {
        nota.printeaza();
    }

    public abstract void printeazafelicitare();
}
