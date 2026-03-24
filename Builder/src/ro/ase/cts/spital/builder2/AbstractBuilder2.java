package ro.ase.cts.spital.builder2;

import ro.ase.cts.spital.builder2.Internare;

public interface AbstractBuilder2 {
    Internare build(String nume);
    AbstractBuilder2 setPatRabatabil(boolean hasPatRabatabil);
    AbstractBuilder2 setHalat(boolean hasHalat);
    AbstractBuilder2 setPapuci(boolean hasPapuci);
    AbstractBuilder2 setMicDeJun(boolean hasMicDeJun);
}
