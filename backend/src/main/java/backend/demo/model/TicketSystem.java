package backend.demo.model;

import backend.demo.repository.TicketSystemRepository;

import javax.persistence.*;
import java.security.Timestamp;


@Entity
public class TicketSystem {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int ticket_id;

        private String ticket_owner;
        private String ticket_context;
        private String ticket_timeStamp;
        private String profile_firstname;
        private String profile_lastname;
        private String profile_mail;

    @Column(name="ticket_active", nullable = false, columnDefinition="INT NOT NULL DEFAULT 1")
    private int ticket_active;
    @Column(name="ticket_taken", columnDefinition="INT default 0")
        private int ticket_taken ;



        public TicketSystem() {
        }

    public TicketSystem(String ticket_owner, String ticket_context, String ticket_timeStamp, String profile_firstname, String profile_lastname, String profile_mail, int ticket_active, int ticket_taken) {
        this.ticket_owner = ticket_owner;
        this.ticket_context = ticket_context;
        this.ticket_timeStamp = ticket_timeStamp;
        this.profile_firstname = profile_firstname;
        this.profile_lastname = profile_lastname;
        this.profile_mail = profile_mail;
        this.ticket_active = ticket_active;
        this.ticket_taken = ticket_taken;
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

    public String getTicket_timeStamp() {
        return ticket_timeStamp;
    }

    public void setTicket_timeStamp(String ticket_timeStamp) {
        this.ticket_timeStamp = ticket_timeStamp;
    }

    public String getProfile_firstname() {
        return profile_firstname;
    }

    public void setProfile_firstname(String profile_firstname) {
        this.profile_firstname = profile_firstname;
    }

    public String getProfile_lastname() {
        return profile_lastname;
    }

    public void setProfile_lastname(String profile_lastname) {
        this.profile_lastname = profile_lastname;
    }

    public String getProfile_mail() {
        return profile_mail;
    }

    public void setProfile_mail(String profile_mail) {
        this.profile_mail = profile_mail;
    }

    public int getTicket_active() {
        return ticket_active;
    }

    public void setTicket_active(int ticket_active) {
        this.ticket_active = ticket_active;
    }

    public int getTicket_taken() {
        return ticket_taken;
    }

    public void setTicket_taken(int ticket_taken) {
        this.ticket_taken = ticket_taken;
    }

    @Override
    public String toString() {
        return "TicketSystem{" +
                "ticket_id=" + ticket_id +
                ", ticket_owner='" + ticket_owner + '\'' +
                ", ticket_context='" + ticket_context + '\'' +
                ", ticket_timeStamp='" + ticket_timeStamp + '\'' +
                ", profile_firstname='" + profile_firstname + '\'' +
                ", profile_lastname='" + profile_lastname + '\'' +
                ", profile_mail='" + profile_mail + '\'' +
                ", ticket_active=" + ticket_active +
                ", ticket_taken=" + ticket_taken +
                '}';
    }
}

