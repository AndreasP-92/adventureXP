package backend.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int activity_id;
    public String activity_name;
    private String activity_desc;
    private String activity_practicalinfo;
    private String activity_datetime;
    private String activity_duration;

    public Activity() {
    }

    public Activity(String activity_name, String activity_desc, String activity_practicalinfo, String activity_datetime, String activity_duration) {
        this.activity_name = activity_name;
        this.activity_desc = activity_desc;
        this.activity_practicalinfo = activity_practicalinfo;
        this.activity_datetime = activity_datetime;
        this.activity_duration = activity_duration;
    }

    public int getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(int activity_id) {
        this.activity_id = activity_id;
    }

    public String getActivity_name() {
        return activity_name;
    }

    public void setActivity_name(String activity_name) {
        this.activity_name = activity_name;
    }

    public String getActivity_desc() {
        return activity_desc;
    }

    public void setActivity_desc(String activity_desc) {
        this.activity_desc = activity_desc;
    }

    public String getActivity_practicalinfo() {
        return activity_practicalinfo;
    }

    public void setActivity_practicalinfo(String activity_practicalinfo) {
        this.activity_practicalinfo = activity_practicalinfo;
    }

    public String getActivity_datetime() {
        return activity_datetime;
    }

    public void setActivity_datetime(String activity_datetime) {
        this.activity_datetime = activity_datetime;
    }

    public String getActivity_duration() {
        return activity_duration;
    }

    public void setActivity_duration(String activity_duration) {
        this.activity_duration = activity_duration;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "activity_id=" + activity_id +
                ", activity_name='" + activity_name + '\'' +
                ", activity_desc='" + activity_desc + '\'' +
                ", activity_practicalinfo='" + activity_practicalinfo + '\'' +
                ", activity_datetime='" + activity_datetime + '\'' +
                ", activity_duration='" + activity_duration + '\'' +
                '}';
    }
}
