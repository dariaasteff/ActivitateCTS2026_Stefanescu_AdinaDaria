package cts.exercitii.pattern.builder;

public class AutobuzLinieBuilder implements Builder{
    private AutobuzLinie autobuz;

    public AutobuzLinieBuilder(String model, String sofer, String derulsator){
        this.autobuz=new AutobuzLinie(model, sofer, false, false, derulsator);
    }

    @Override
    public AutobuzLinie build() {
        return autobuz;
    }

    @Override
    public Builder setModel(String model) {
        this.autobuz.setModel(model);
        return this;
    }

    @Override
    public Builder setSofer(String sofer) {
        this.autobuz.setSofer(sofer);
        return this;
    }

    @Override
    public Builder setOprireCapat(boolean oprireCapat) {
        this.autobuz.setOprireCapat(oprireCapat);
        return this;
    }

    @Override
    public Builder setDeschidereUsi(boolean deschidereUsi) {
        this.autobuz.setDeschidereUsi(deschidereUsi);
        return this;
    }

    @Override
    public Builder setDerulator(String derulator) {
        this.autobuz.setDerulator(derulator);
        return this;
    }
}
