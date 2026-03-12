package ro.ase.cts.stb.program;

import ro.ase.cts.stb.factory.MijlocTransportFactory;
import ro.ase.cts.stb.factory.MijlocTransportType;
import ro.ase.cts.stb.vehicle.MijlocTransport;

import javax.sound.midi.MidiChannel;
public class Main {
    public static void afisareDescriere(MijlocTransport mijlocTransport)
    {
        System.out.println(mijlocTransport);
    }

    public static void main(String[] args) throws Exception {
        MijlocTransportFactory factory = MijlocTransportFactory.getInstance();
        MijlocTransport autobuz = factory.getMijlocTransport("Mercedes", 432, MijlocTransportType.AUTOBUZ);
        MijlocTransport tramvai = factory.getMijlocTransport("Astra", 101, MijlocTransportType.TRAMVAI);
        MijlocTransport troleibuz = factory.getMijlocTransport("Otokar", 44, MijlocTransportType.TROLEIBUZ);
        afisareDescriere(autobuz);
        afisareDescriere(tramvai);
        afisareDescriere(troleibuz);

    }
}
