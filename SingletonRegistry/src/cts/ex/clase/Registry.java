package cts.ex.clase;

import java.util.HashMap;
import java.util.Map;

public class Registry {
//    private Registry() {
//    }
//
//    private static Map<String, RoboticArmConnection> colectie=new HashMap<>();
//
//    //put
//    public static void register(String nume, RoboticArmConnection value){
//        if(colectie.containsKey(nume))
//            System.out.println("Exista deja");
//        else colectie.put(nume, value);
//    }
//
//    //get
//    public static RoboticArmConnection getConnection(String nume){
//        return colectie.get(nume);
//    }



    private Registry(){

    }

    private static Map<String, RoboticArmConnection> colectie=new HashMap<>();

    public static void register(String nume, RoboticArmConnection valoare){
        if(colectie.containsKey(nume))
            System.out.println("Exista deja");
        else colectie.put(nume, valoare);
    }

    public static RoboticArmConnection getConnection(String nume){
        return colectie.get(nume);
    }

}
