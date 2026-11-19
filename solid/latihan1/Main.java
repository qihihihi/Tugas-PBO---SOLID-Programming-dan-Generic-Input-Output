
interface Notifier {
    void send(String message);
}

class EmailNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Mengirim Email: " + message);
    }
}

class SMSNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Mengirim SMS: " + message);
    }
}

class WhatsAppNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Mengirim WhatsApp: " + message);
    }
}

// Menambahkan platform baru
class TelegramNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Mengirim Telegram: " + message);
    }
}

class NotificationService {
    private Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void notify(String message) {
        notifier.send(message);
    }
}

public class Main {
    public static void main(String[] args) {
        NotificationService notif =
            new NotificationService(new EmailNotifier());

        notif.notify("Halo, ini email test!");

        NotificationService telegram =
            new NotificationService(new TelegramNotifier());

        telegram.notify("Halo dari Telegram!");
    }
}
