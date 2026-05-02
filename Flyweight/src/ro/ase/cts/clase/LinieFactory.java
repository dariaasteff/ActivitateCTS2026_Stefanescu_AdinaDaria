package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class LinieFactory {
    public Map<Integer,LinieDeTransport> map=new HashMap<>();

    public LinieDeTransport getLinie(int nrLinie, String primaStatie, String ultimaStatie){
        if(map.containsKey(nrLinie)){
            return map.get(nrLinie);
        }
        else{
            LinieDeTransport linie=new Linie(nrLinie, primaStatie, ultimaStatie);
            map.put(nrLinie,linie);
            return linie;
        }
    }
}
