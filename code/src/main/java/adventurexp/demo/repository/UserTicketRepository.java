package adventurexp.demo.repository;

import adventurexp.demo.model.UserTicket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTicketRepository extends JpaRepository<UserTicket, Integer> {
}
