package uk.layme.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.layme.magalums.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
