package ro.ase.cts.clase;

public class NotificareEmail extends NotificareHandler{

    @Override
    public String trimiteNotificare(Student student) {
        if(student.getEmail().isEmpty())
            return this.notificareHandler.trimiteNotificare(student);
        else return "Studentul a primit mail";
    }
}
