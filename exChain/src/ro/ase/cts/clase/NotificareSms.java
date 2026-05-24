package ro.ase.cts.clase;

public class NotificareSms extends NotificareHandler{


    @Override
    public String trimiteNotificare(Student student) {
        if(student.getNrTel().isEmpty())
            return this.notificareHandler.trimiteNotificare(student);
        else return "Studentul  aprimit sms";
    }
}
