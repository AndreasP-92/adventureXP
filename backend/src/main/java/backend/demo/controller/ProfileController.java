package backend.demo.controller;

import backend.demo.model.Booking;
import backend.demo.model.Profile;
import backend.demo.repository.ProfileRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfileController {

    ProfileRepository profileRepository;

    public ProfileController(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @GetMapping("/profiles")
    public List<Profile> getProfiles(Model model) {
        List<Profile> profiles = profileRepository.findAll();
        return profiles;
    }

    @PostMapping(value = "/insert/profile", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Profile insertProfile(@RequestBody Profile profile) {
        System.out.println(profile);

        return profileRepository.save(profile);
    }
}