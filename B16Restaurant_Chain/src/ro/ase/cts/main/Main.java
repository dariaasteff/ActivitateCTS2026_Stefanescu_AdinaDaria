package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        NotificareHandler sms=new NotificareSMS();
        NotificareHandler email=new NotificareEmail();
        NotificareHandler manager=new NotificareManager();
        Client c1=new Client("Gigel","","@gigel");
        Client c2=new Client("Marcel","0766","gshhs");
        Client c3=new Client("Alina","","");
        sms.setNotificareHandler(email);
        email.setNotificareHandler(manager);
        System.out.println(sms.trimiteNotificare(c3));
    }
}
