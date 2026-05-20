package ro.ase.cts.clase;

public class NotificareManager extends NotificareHandler{
    @Override
    public String trimiteNotificare(Client client) {
        return "clientul nu are nr de telfon nici email, a fost notificat managerul";
    }
}
