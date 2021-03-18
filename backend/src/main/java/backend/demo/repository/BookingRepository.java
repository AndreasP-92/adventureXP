package backend.demo.repository;

import backend.demo.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {



//    public Booking findBy(String activity);
    public Booking findByActivity(String activity);

    List<Booking> findAllByMail(String mail);
}
