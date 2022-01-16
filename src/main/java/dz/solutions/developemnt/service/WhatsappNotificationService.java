package dz.solutions.developemnt.service;

public class WhatsappNotificationService implements NotificationService{
    @Override
    public String send(String message) {
        return "Send notification by Whatsapp";
    }

    @Override
    public Boolean read(Long notificationId) {
        return null;
    }
}
