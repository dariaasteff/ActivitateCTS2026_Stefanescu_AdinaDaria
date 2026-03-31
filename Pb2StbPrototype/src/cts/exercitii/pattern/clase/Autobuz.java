package cts.exercitii.pattern.clase;

public class Autobuz implements IAutobuzCopie{
    String model;
    String sofer;

    public Autobuz(String model, String sofer) {
        this.model = model;
        this.sofer = sofer;
    }

    public Autobuz() {
    }

    @Override
    public IAutobuzCopie copie() {
        Autobuz autobuzNou=new Autobuz();
        autobuzNou.model=this.model;
        autobuzNou.sofer=this.sofer;
        return (IAutobuzCopie) autobuzNou;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSofer(String sofer) {
        this.sofer = sofer;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", sofer='").append(sofer).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
