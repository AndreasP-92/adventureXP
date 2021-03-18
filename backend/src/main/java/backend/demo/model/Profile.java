package backend.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int profile_id;

    public int getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(int profile_id) {
        this.profile_id = profile_id;
    }


    private String profile_firstname;
    private String profile_lastname;
    private int profile_phone;

//    @OneToMany
//    @JoinColumn(name = "profile_id")
//    private Set<User> users = new HashSet<>();
    @ManyToOne
    @JsonBackReference
    private User user;

    public Profile() {
    }

    public Profile(String profile_firstname, String profile_lastname, int profile_phone) {
        this.profile_firstname = profile_firstname;
        this.profile_lastname = profile_lastname;
        this.profile_phone = profile_phone;
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

    public int getProfile_phone() {
        return profile_phone;
    }

    public void setProfile_phone(int profile_phone) {
        this.profile_phone = profile_phone;
    }

//    public Set<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(Set<User> users) {
//        this.users = users;
//    }
//    }

    @Override
    public String toString() {
        return "Profile{" +
                "profile_id=" + profile_id +
                ", profile_firstname='" + profile_firstname + '\'' +
                ", profile_lastname='" + profile_lastname + '\'' +
                ", profile_phone=" + profile_phone +

                '}';
    }
}
