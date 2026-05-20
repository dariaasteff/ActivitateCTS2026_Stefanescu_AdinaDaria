package ro.ase.cts.clase;

public class NotificareEmail extends NotificareHandler{
    @Override
    public String trimiteNotificare(Client client) {
        if(client.getEmail().isEmpty())
            return this.notificareHandler.trimiteNotificare(client);
        else return "clientul a fost notificat prin email";
    }
}
