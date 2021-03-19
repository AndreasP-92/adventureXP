package backend.demo.repository;

import backend.demo.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    Booking findBookingsByBooking_activity(String booking);
}
