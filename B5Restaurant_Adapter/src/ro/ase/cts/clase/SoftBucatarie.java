package ro.ase.cts.clase;

public class SoftBucatarie {
    private String modelPrintare;

    public SoftBucatarie(String modelPrintare) {
        this.modelPrintare = modelPrintare;
    }

    public void printeazaFacturaMancare(double costMancare){
        System.out.println("Factura e printata "+this.modelPrintare+" si are valoarea de "+costMancare+" lei");
    }
}
