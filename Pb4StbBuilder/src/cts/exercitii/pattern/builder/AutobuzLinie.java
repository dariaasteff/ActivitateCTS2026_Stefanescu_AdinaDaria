package cts.exercitii.pattern.builder;

public class AutobuzLinie {
    String model;
    String sofer;
    boolean oprireCapat;
    boolean deschidereUsi;
    String derulator;

    public AutobuzLinie(String model, String sofer, boolean oprireCapat, boolean deschidereUsi, String derulator) {
        this.model = model;
        this.sofer = sofer;
        this.oprireCapat = oprireCapat;
        this.deschidereUsi = deschidereUsi;
        this.derulator = derulator;
    }

    public AutobuzLinie() {
        this.model="";
        this.sofer="";
        this.oprireCapat=false;
        this.deschidereUsi=false;
        this.derulator="";
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSofer(String sofer) {
        this.sofer = sofer;
    }

    public void setOprireCapat(boolean oprireCapat) {
        this.oprireCapat = oprireCapat;
    }

    public void setDeschidereUsi(boolean deschidereUsi) {
        this.deschidereUsi = deschidereUsi;
    }

    public void setDerulator(String derulator) {
        this.derulator = derulator;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("model='").append(model).append('\'');
        sb.append(", sofer='").append(sofer).append('\'');
        sb.append(", oprireCapat=").append(oprireCapat);
        sb.append(", deschidereUsi=").append(deschidereUsi);
        sb.append(", derulator='").append(derulator).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
