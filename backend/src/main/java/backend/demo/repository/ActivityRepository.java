package backend.demo.repository;

import backend.demo.model.Activity;
import backend.demo.model.Booking;
import backend.demo.model.ProfileAbout;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
//    List<Activity> findByActivity_name(Long id);
    public Activity findByName(String name);
}
