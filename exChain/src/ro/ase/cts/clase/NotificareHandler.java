package ro.ase.cts.clase;

public abstract class NotificareHandler {
    protected  NotificareHandler notificareHandler;

    public NotificareHandler(NotificareHandler notificareHandler) {
        this.notificareHandler = notificareHandler;
    }

    protected NotificareHandler() {
    }

    public void setNotificareHandler(NotificareHandler notificareHandler) {
        this.notificareHandler = notificareHandler;
    }

    public abstract String trimiteNotificare(Student student);
}
