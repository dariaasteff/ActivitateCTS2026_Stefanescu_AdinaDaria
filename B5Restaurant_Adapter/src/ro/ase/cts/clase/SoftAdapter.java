package ro.ase.cts.clase;

public class SoftAdapter extends SoftBucatarie{

    private SoftNouBar softNou;

    public SoftAdapter(SoftNouBar softNou) {
        super(softNou.getModelPrintare());
        this.softNou = softNou;
    }

    @Override
    public void printeazaFacturaMancare(double costMancare) {
        this.softNou.genereazaNotaBauturi(costMancare);
    }
}
