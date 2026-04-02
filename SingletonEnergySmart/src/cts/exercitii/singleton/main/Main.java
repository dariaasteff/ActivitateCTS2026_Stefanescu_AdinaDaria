package cts.exercitii.singleton.main;

import cts.exercitii.singleton.clase.CentruControl;

public class Main {
    public static void main(String[] args) {
        CentruControl c1=CentruControl.getInstance();
        c1.setConsumTotal(500);

        CentruControl c2=CentruControl.getInstance();
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
