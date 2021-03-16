package adventurexp.demo.repository;

import adventurexp.demo.model.TicketSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TicketSystemRepository extends JpaRepository<TicketSystem, Integer> {


}
