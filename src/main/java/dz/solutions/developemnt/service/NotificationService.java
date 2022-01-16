package dz.solutions.developemnt.service;

public interface NotificationService {
    String send(String message);
    Boolean read(Long notificationId);
}
