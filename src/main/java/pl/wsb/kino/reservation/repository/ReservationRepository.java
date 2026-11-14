package pl.wsb.kino.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wsb.kino.reservation.entity.Reservation;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findByUser_Email(String email);
}
