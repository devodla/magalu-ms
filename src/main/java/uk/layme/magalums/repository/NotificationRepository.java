package uk.layme.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.layme.magalums.entity.Notification;
import uk.layme.magalums.entity.Status;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByStatusInAndDateTimeBefore(List<Status> status, LocalDateTime dateTime);
}
