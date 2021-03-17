package backend.demo.controller;

import backend.demo.model.Activity;
import backend.demo.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActivityController {

    @Autowired
    ActivityRepository activityRepository;

    @GetMapping("/select/activities")
    public List<Activity> getActivities(){
        List<Activity> activities = activityRepository.findAll();

        return activities;
    }
}
