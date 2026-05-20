package ro.ase.cts.clase;

public abstract class NotificareHandler {
    protected NotificareHandler notificareHandler;

    public NotificareHandler() {
        this.notificareHandler = null;
    }

    public void setNotificareHandler(NotificareHandler notificareHandler) {
        this.notificareHandler = notificareHandler;
    }

    public abstract String trimiteNotificare(Client client);
}
