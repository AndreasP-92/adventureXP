package backend.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String name;
    public String start;
    public String end;
    public String age;
    public String size;
    public String desc;
    public String pic;

    public Activity() {
    }

    public Activity(String name, String start, String end, String age, String size, String desc, String pic) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.age = age;
        this.size = size;
        this.desc = desc;
        this.pic = pic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", age='" + age + '\'' +
                ", size='" + size + '\'' +
                ", desc='" + desc + '\'' +
                ", pic='" + pic + '\'' +
                '}';
    }
}
