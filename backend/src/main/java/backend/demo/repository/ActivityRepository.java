package backend.demo.repository;

import backend.demo.model.Activity;
import backend.demo.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Long> {

}
