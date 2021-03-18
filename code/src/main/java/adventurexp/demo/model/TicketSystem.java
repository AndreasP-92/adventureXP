package adventurexp.demo.model;


import adventurexp.demo.model.UserTicket;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import org.apache.catalina.User;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class TicketSystem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticket_id;

    private String ticket_owner;
    private String ticket_context;
    private Timestamp ticket_timeStamp;

    public TicketSystem() {
    }


    public TicketSystem(String ticket_owner, String ticket_context, Timestamp ticket_timeStamp) {
        this.ticket_owner = ticket_owner;
        this.ticket_context = ticket_context;
        this.ticket_timeStamp = ticket_timeStamp;
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getTicket_owner() {
        return ticket_owner;
    }

    public void setTicket_owner(String ticket_owner) {
        this.ticket_owner = ticket_owner;
    }

    public String getTicket_context() {
        return ticket_context;
    }

    public void setTicket_context(String ticket_context) {
        this.ticket_context = ticket_context;
    }

    public Timestamp getTicket_timeStamp() {
        return ticket_timeStamp;
    }

    public void setTicket_timeStamp(Timestamp ticket_timeStamp) {
        this.ticket_timeStamp = ticket_timeStamp;
    }
}