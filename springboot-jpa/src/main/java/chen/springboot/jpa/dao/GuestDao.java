package chen.springboot.jpa.dao;


import chen.springboot.jpa.domain.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestDao extends JpaRepository<Guest,Long> {
}
