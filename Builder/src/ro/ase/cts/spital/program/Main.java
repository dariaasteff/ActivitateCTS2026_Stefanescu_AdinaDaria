package ro.ase.cts.spital.program;

import ro.ase.cts.spital.builder1.AbstractBuilder;
import ro.ase.cts.spital.builder1.Internare;
import ro.ase.cts.spital.builder1.InternareBuilder;
import ro.ase.cts.spital.builder2.AbstractBuilder2;
import ro.ase.cts.spital.builder2.InternareBuilder2;

public class Main {
    public static void main(String[] args) {
        Internare internare = new Internare();
        internare.setNume("Maria");
        internare.setHasPatRabatabil(true);
        Internare internare2 = new Internare("Ionica",false,false,true,false);

        AbstractBuilder builder = new InternareBuilder("Mariana");
        Internare internare3 = builder.setPatRabatabil(true).build();
        Internare internare4 = builder.setPapuci(true).setNume("Gigel").build();

        System.out.println(internare3);
        System.out.println(internare4);

        AbstractBuilder2 builder2 = new InternareBuilder2()
                .setMicDeJun(true);
        ro.ase.cts.spital.builder2.Internare internare5 = builder2.build("Gica");
        ro.ase.cts.spital.builder2.Internare internare6 = builder2.build("Ana");

        internare5.setHasHalat(true);
        //to do inner class varianta 3
    }
}
