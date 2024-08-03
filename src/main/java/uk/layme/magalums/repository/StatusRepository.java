package uk.layme.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.layme.magalums.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
