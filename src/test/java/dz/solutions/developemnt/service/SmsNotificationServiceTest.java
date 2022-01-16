package dz.solutions.developemnt.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmsNotificationServiceTest {

    @Test
    @DisplayName("test send notification")
    public void testSend(){
        NotificationService notificationService = new SmsNotificationService();
        assertEquals(notificationService.send("sms"), "sms");
    }

    @Test
    public void testRead() {
        NotificationService notificationService = new SmsNotificationService();
        assertTrue(notificationService.read(10L));
    }
}
