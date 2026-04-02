package cts.ex.clase;

public class Temperatura implements RoboticArmConnection{

    public Temperatura() {
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("s a conectat temperatura");
    }
}
