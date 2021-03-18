package adventurexp.demo.model;

import org.apache.catalina.User;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class UserTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_ticket_id;

    public int getUser_ticket_id(){
        return user_ticket_id;
    }

    public void setUser_ticket_id(int user_ticket_id) {
        this.user_ticket_id = user_ticket_id;
    }

    private String fk_userMail;
    private int fk_ticket;

    @OneToMany
    @JoinColumn(name = "user_ticket_id")
    private Set<TicketSystem> ticketSystems = new HashSet<>();

    public UserTicket(String fk_userMail, int fk_ticket) {
        this.fk_userMail = fk_userMail;
        this.fk_ticket = fk_ticket;
    }

    public UserTicket() {
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserTicket userTicket = (UserTicket) o;
        return Objects.equals(user_ticket_id, userTicket.user_ticket_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_ticket_id);
    }

    @Override
    public String toString() {
        return "UserTicket{" +
                "user_ticket_id=" + user_ticket_id +
                ", fk_userMail='" + fk_userMail + '\'' +
                ", fk_ticket=" + fk_ticket +
                ", ticketSystems=" + ticketSystems +
                '}';
    }



    public String getFk_userMail() {
        return fk_userMail;
    }

    public void setFk_userMail(String fk_userMail) {
        this.fk_userMail = fk_userMail;
    }

    public int getFk_ticket() {
        return fk_ticket;
    }

    public void setFk_ticket(int fk_ticket) {
        this.fk_ticket = fk_ticket;
    }

    public Set<TicketSystem> getTicketSystems() {
        return ticketSystems;
    }

    public void setTicketSystems(Set<TicketSystem> ticketSystems) {
        this.ticketSystems = ticketSystems;
    }
}
