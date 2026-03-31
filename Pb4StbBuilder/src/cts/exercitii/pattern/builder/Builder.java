package cts.exercitii.pattern.builder;

public interface Builder {
    AutobuzLinie build();
    Builder setModel(String model);
    Builder setSofer(String sofer);
    Builder setOprireCapat(boolean oprireCapat);
    Builder setDeschidereUsi(boolean deschidereUsi);
    Builder setDerulator(String derulator);
}
