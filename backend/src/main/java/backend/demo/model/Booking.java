package backend.demo.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int booking_id;
    private String booking_activity;
    private String booking_guests;
    private String booking_datetime;
    private String booking_arrival;
    private String booking_firstname;
    private String booking_lastname;
    private String booking_phone;
    private String booking_mail;
    @Column(precision=10, scale=2)
    private double booking_paid;

    public Booking() {
    }

    public Booking(String booking_activity, String booking_guests, String booking_datetime, String booking_arrival, String booking_firstname, String booking_lastname, String booking_phone, String booking_mail, double booking_paid) {
        this.booking_activity = booking_activity;
        this.booking_guests = booking_guests;
        this.booking_datetime = booking_datetime;
        this.booking_arrival = booking_arrival;
        this.booking_firstname = booking_firstname;
        this.booking_lastname = booking_lastname;
        this.booking_phone = booking_phone;
        this.booking_mail = booking_mail;
        this.booking_paid = booking_paid;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public String getBooking_activity() {
        return booking_activity;
    }

    public void setBooking_activity(String booking_activity) {
        this.booking_activity = booking_activity;
    }

    public String getBooking_guests() {
        return booking_guests;
    }

    public void setBooking_guests(String booking_guests) {
        this.booking_guests = booking_guests;
    }

    public String getBooking_datetime() {
        return booking_datetime;
    }

    public void setBooking_datetime(String booking_datetime) {
        this.booking_datetime = booking_datetime;
    }

    public String getBooking_arrival() {
        return booking_arrival;
    }

    public void setBooking_arrival(String booking_arrival) {
        this.booking_arrival = booking_arrival;
    }

    public String getBooking_firstname() {
        return booking_firstname;
    }

    public void setBooking_firstname(String booking_firstname) {
        this.booking_firstname = booking_firstname;
    }

    public String getBooking_lastname() {
        return booking_lastname;
    }

    public void setBooking_lastname(String booking_lastname) {
        this.booking_lastname = booking_lastname;
    }

    public String getBooking_phone() {
        return booking_phone;
    }

    public void setBooking_phone(String booking_phone) {
        this.booking_phone = booking_phone;
    }

    public String getBooking_mail() {
        return booking_mail;
    }

    public void setBooking_mail(String booking_mail) {
        this.booking_mail = booking_mail;
    }

    public double getBooking_paid() {
        return booking_paid;
    }

    public void setBooking_paid(double booking_paid) {
        this.booking_paid = booking_paid;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "booking_id=" + booking_id +
                ", booking_activity='" + booking_activity + '\'' +
                ", booking_guests='" + booking_guests + '\'' +
                ", booking_datetime='" + booking_datetime + '\'' +
                ", booking_arrival='" + booking_arrival + '\'' +
                ", booking_firstname='" + booking_firstname + '\'' +
                ", booking_lastname='" + booking_lastname + '\'' +
                ", booking_phone='" + booking_phone + '\'' +
                ", booking_mail='" + booking_mail + '\'' +
                ", booking_paid=" + booking_paid +
                '}';
    }
}
