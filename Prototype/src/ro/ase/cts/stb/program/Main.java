package ro.ase.cts.stb.program;

import ro.ase.cts.stb.prototype.IRezervare;
import ro.ase.cts.stb.prototype.Rezervare;

public class Main {
    public static void main(String[] args) throws Exception {

        IRezervare rezervare1 = new Rezervare("0766974137","05/07/2025",3,"Gigel");

        IRezervare rezervare2 = rezervare1.copiaza();
        ((Rezervare) rezervare2).setData("14/04/2026");
        ((Rezervare) rezervare2).setNrPersoane(5);

        System.out.println(rezervare1);
        System.out.println(rezervare2);
    }
}