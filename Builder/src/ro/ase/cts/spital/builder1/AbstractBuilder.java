package ro.ase.cts.spital.builder1;

public interface AbstractBuilder {
    Internare build();
    AbstractBuilder setNume(String nume);
    AbstractBuilder setPatRabatabil(boolean hasPatRabatabil);
    AbstractBuilder setHalat(boolean hasHalat);
    AbstractBuilder setPapuci(boolean hasPapuci);
    AbstractBuilder setMicDeJun(boolean hasMicDeJun);
}
