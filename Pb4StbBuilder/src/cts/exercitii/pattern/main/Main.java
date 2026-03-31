package cts.exercitii.pattern.main;

import cts.exercitii.pattern.builder.AutobuzLinie;
import cts.exercitii.pattern.builder.AutobuzLinieBuilder;
import cts.exercitii.pattern.builder.Builder;

public class Main {
    public static void main(String[] args){
        AutobuzLinie autobuz=new AutobuzLinie();
        autobuz.setModel("MERCEDES");
        autobuz.setSofer("Gigel");
        autobuz.setDeschidereUsi(true);

        AutobuzLinie autobuz2= new AutobuzLinie("BMW","Marian", false, true,"Autobuzuzl se retrage la autobaza");

        Builder builder=new AutobuzLinieBuilder("AUDI","Sumudica","Autobuzul stationeaza 2 minute");
        AutobuzLinie autobuz3=builder.setDeschidereUsi(true).build();
        AutobuzLinie autobuz4=builder.setSofer("Hagi").setOprireCapat(true).build();
        System.out.println(autobuz);
        System.out.println(autobuz2);
        System.out.println(autobuz3);
        System.out.println(autobuz4);
    }

}
