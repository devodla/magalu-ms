package uk.layme.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.layme.magalums.entity.Channel;

public interface ChannelRepository extends JpaRepository<Channel, Long> {
}
