package ro.ase.cts.spital.builder2;

public class InternareBuilder2 implements AbstractBuilder2{
    private boolean hasPatRabatabil;
    private boolean hasMicDeJun;
    private boolean hasPapuciCamera;
    private boolean hasHalat;

    public InternareBuilder2() {
        this.hasPatRabatabil = false;
        this.hasMicDeJun = false;
        this.hasPapuciCamera = false;
        this.hasHalat = false;
    }

    @Override
    public Internare build(String nume) {
        return new Internare(nume,hasPatRabatabil,hasMicDeJun,hasPapuciCamera,hasHalat);
    }

    @Override
    public AbstractBuilder2 setPatRabatabil(boolean hasPatRabatabil) {
        this.hasPatRabatabil = hasPatRabatabil;
        return this;
    }

    @Override
    public AbstractBuilder2 setHalat(boolean hasHalat) {
        this.hasHalat = hasHalat;
        return this;
    }

    @Override
    public AbstractBuilder2 setPapuci(boolean hasPapuci) {
        this.hasPapuciCamera = hasPapuci;
        return this;
    }

    @Override
    public AbstractBuilder2 setMicDeJun(boolean hasMicDeJun) {
        this.hasMicDeJun = hasMicDeJun;
        return this;
    }
}
