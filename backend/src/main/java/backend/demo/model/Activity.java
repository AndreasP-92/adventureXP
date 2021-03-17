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
    private String activity_avail_start;
    private String activity_avail_end;
    private String activity_min_age;
    private String activity_group_size;
    private String activity_desc;


    public Activity() {
    }

    public Activity(String activity_name, String activity_avail_start, String activity_avail_end, String activity_min_age, String activity_group_size, String activity_desc) {
        this.activity_name = activity_name;
        this.activity_avail_start = activity_avail_start;
        this.activity_avail_end = activity_avail_end;
        this.activity_min_age = activity_min_age;
        this.activity_group_size = activity_group_size;
        this.activity_desc = activity_desc;
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

    public String getActivity_avail_start() {
        return activity_avail_start;
    }

    public void setActivity_avail_start(String activity_avail_start) {
        this.activity_avail_start = activity_avail_start;
    }

    public String getActivity_avail_end() {
        return activity_avail_end;
    }

    public void setActivity_avail_end(String activity_avail_end) {
        this.activity_avail_end = activity_avail_end;
    }

    public String getActivity_min_age() {
        return activity_min_age;
    }

    public void setActivity_min_age(String activity_min_age) {
        this.activity_min_age = activity_min_age;
    }

    public String getActivity_group_size() {
        return activity_group_size;
    }

    public void setActivity_group_size(String activity_group_size) {
        this.activity_group_size = activity_group_size;
    }

    public String getActivity_desc() {
        return activity_desc;
    }

    public void setActivity_desc(String activity_desc) {
        this.activity_desc = activity_desc;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "activity_id=" + activity_id +
                ", activity_name='" + activity_name + '\'' +
                ", activity_avail_start='" + activity_avail_start + '\'' +
                ", activity_avail_end='" + activity_avail_end + '\'' +
                ", activity_min_age='" + activity_min_age + '\'' +
                ", activity_group_size='" + activity_group_size + '\'' +
                ", activity_desc='" + activity_desc + '\'' +
                '}';
    }
}
