package ro.ase.cts.clase;

public class SoftNouBar {
    private String modelPrintare;

    public SoftNouBar(String modelPrintare) {
        this.modelPrintare = modelPrintare;
    }

    public String getModelPrintare() {
        return modelPrintare;
    }

    public void genereazaNotaBauturi(double costBauturi){
        System.out.println("Nota bauturilor a fost generata "+this.modelPrintare+" si a costat "+costBauturi+" lei");
    }
}
