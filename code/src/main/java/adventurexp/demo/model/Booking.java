package adventurexp.demo.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int booking_id;
    private String booking_name;
    private String booking_phone;
    private Timestamp booking_datetime;
    private String booking_activity;
    @Column(precision=10, scale=2)
    private double booking_paid;

    public Booking() {
    }

    public Booking(String booking_name, String booking_phone, Timestamp booking_datetime, String booking_activity, double booking_paid) {
        this.booking_name = booking_name;
        this.booking_phone = booking_phone;
        this.booking_datetime = booking_datetime;
        this.booking_activity = booking_activity;
        this.booking_paid = booking_paid;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public String getBooking_name() {
        return booking_name;
    }

    public void setBooking_name(String booking_name) {
        this.booking_name = booking_name;
    }

    public String getBooking_phone() {
        return booking_phone;
    }

    public void setBooking_phone(String booking_phone) {
        this.booking_phone = booking_phone;
    }

    public Timestamp getBooking_datetime() {
        return booking_datetime;
    }

    public void setBooking_datetime(Timestamp booking_datetime) {
        this.booking_datetime = booking_datetime;
    }

    public String getBooking_activity() {
        return booking_activity;
    }

    public void setBooking_activity(String booking_activity) {
        this.booking_activity = booking_activity;
    }

    public double getBooking_paid() {
        return booking_paid;
    }

    public void setBooking_paid(double booking_paid) {
        this.booking_paid = booking_paid;
    }
}
