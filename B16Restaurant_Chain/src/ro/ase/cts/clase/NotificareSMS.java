package ro.ase.cts.clase;

public class NotificareSMS extends NotificareHandler{
    @Override
    public String trimiteNotificare(Client client) {
        if(client.getNrTel().isEmpty())
            return this.notificareHandler.trimiteNotificare(client);
        else return "Clientul a fost notificat prin sms";
    }
}
