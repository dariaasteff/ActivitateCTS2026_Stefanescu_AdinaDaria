package ro.ase.cts.main;

import ro.ase.cts.clase.SoftAdapter;
import ro.ase.cts.clase.SoftBucatarie;
import ro.ase.cts.clase.SoftNouBar;

public class Main {
    public static void main(String[] args) {
        SoftBucatarie softVechi=new SoftBucatarie("factura manuala");
        softVechi.printeazaFacturaMancare(176);

        SoftNouBar softNou=new SoftNouBar("factura digitala");
        SoftAdapter adapter=new SoftAdapter(softNou);
        adapter.printeazaFacturaMancare(130);
    }
}
