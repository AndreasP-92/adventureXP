package adventurexp.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class CreateEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String activityName;
    private Timestamp activityTimeStart;
    private Timestamp activityTimeSlut;
    private int minAge;
    private int groupSize;
    private String activityDesc;

    public CreateEvent() {
    }

    public CreateEvent(String activityName, Timestamp activityTimeStart, Timestamp activityTimeSlut, int minAge, int groupSize, String activityDesc) {
        this.activityName = activityName;
        this.activityTimeStart = activityTimeStart;
        this.activityTimeSlut = activityTimeSlut;
        this.minAge = minAge;
        this.groupSize = groupSize;
        this.activityDesc = activityDesc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Timestamp getActivityTimeStart() {
        return activityTimeStart;
    }

    public void setActivityTimeStart(Timestamp activityTimeStart) {
        this.activityTimeStart = activityTimeStart;
    }

    public Timestamp getActivityTimeSlut() {
        return activityTimeSlut;
    }

    public void setActivityTimeSlut(Timestamp activityTimeSlut) {
        this.activityTimeSlut = activityTimeSlut;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }

    public String getActivityDesc() {
        return activityDesc;
    }

    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc;
    }
}
