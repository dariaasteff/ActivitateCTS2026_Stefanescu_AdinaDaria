package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student("Ion","0999","hsjsj");
        Student s2=new Student("Marcel","","aadd");
        NotificareHandler n1=new NotificareSms();
        NotificareHandler n2=new NotificareEmail();
        NotificareHandler n3=new NotificarePersonala();
        n1.setNotificareHandler(n2);
        n2.setNotificareHandler(n3);
        n1.trimiteNotificare(s1);
        n1.trimiteNotificare(s2);
    }
}
