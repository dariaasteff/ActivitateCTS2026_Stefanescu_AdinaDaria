package ro.ase.cts.clase;

public class NotificarePersonala extends NotificareHandler{


    @Override
    public String trimiteNotificare(Student student) {
        return "Studentul va fi notificat personal";
    }
}
