package dz.solutions.developemnt.service;

public class SmsNotificationService implements NotificationService{
    @Override
    public String send(String message) {
        return message;
    }

    @Override
    public Boolean read(Long notificationId) {
        return true;
    }
}
