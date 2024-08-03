package uk.layme.magalums.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.layme.magalums.controller.dto.ScheduleNotificationDto;
import uk.layme.magalums.entity.Notification;
import uk.layme.magalums.service.NotificationService;

import java.util.Optional;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<Void> scheduleNotification(@RequestBody ScheduleNotificationDto dto) {
        notificationService.scheduleNotification(dto);
        return ResponseEntity.accepted().build();
    }

    @GetMapping("/{notificationId}")
    public ResponseEntity<Notification> getNotification(@PathVariable Long notificationId) {
        Optional<Notification> notification = notificationService.findById(notificationId);

        if (notification.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(notification.get());
    }

    @DeleteMapping("/{notificationId}")
    public ResponseEntity<Void> cancelNotification(@PathVariable Long notificationId) {
        notificationService.cancelNotification(notificationId);
        return ResponseEntity.noContent().build();
    }
}
