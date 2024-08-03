package uk.layme.magalums.service;

import org.springframework.stereotype.Service;
import uk.layme.magalums.controller.dto.ScheduleNotificationDto;
import uk.layme.magalums.entity.Notification;
import uk.layme.magalums.repository.NotificationRepository;

import java.util.Optional;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void scheduleNotification(ScheduleNotificationDto dto) {
        notificationRepository.save(dto.toNotification());
    }

    public Optional<Notification> findById(Long notificationId) {
        return notificationRepository.findById(notificationId);
    }
}
