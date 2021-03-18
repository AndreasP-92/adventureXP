package backend.demo.repository;

import backend.demo.model.TicketSystem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TicketSystemRepository extends JpaRepository<TicketSystem, Integer> {
    

}
