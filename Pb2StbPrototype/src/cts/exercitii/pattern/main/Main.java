package cts.exercitii.pattern.main;

import cts.exercitii.pattern.clase.Autobuz;
import cts.exercitii.pattern.clase.IAutobuzCopie;

public class Main {
    public static void main(String [] args){
        IAutobuzCopie autobuz1= new Autobuz("BMW", "Gigel");
        IAutobuzCopie autobuz2 = autobuz1.copie();
        ((Autobuz)autobuz2).setModel("Mercedes");

        System.out.println(autobuz1);
        System.out.println(autobuz2);
    }
}
