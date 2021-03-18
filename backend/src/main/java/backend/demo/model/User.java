package backend.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    private String user_mail;
    private String user_password;
    private int user_enabled;


    @OneToMany
    @JoinColumn(name = "user_id")
    private Set<Profile> profiles = new HashSet<>();

//    @ManyToOne
//    @JsonBackReference
//    private Profile profile;

    public User() {
    }

    public User(String user_mail, String user_password, int user_enabled) {
        this.user_mail = user_mail;
        this.user_password = user_password;
        this.user_enabled = user_enabled;
    }


    public String getUser_mail() {
        return user_mail;
    }

    public void setUser_mail(String user_mail) {
        this.user_mail = user_mail;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public int getUser_enabled() {
        return user_enabled;
    }

    public void setUser_enabled(int user_enabled) {
        this.user_enabled = user_enabled;
    }
    public Set<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(Set<Profile> profiles) {
        this.profiles = profiles;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_mail='" + user_mail + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_enabled=" + user_enabled +
                '}';
    }
}
