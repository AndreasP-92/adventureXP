package com.example.demo.controller;

import com.example.demo.repository.ProfileAboutRepository;
import com.example.demo.model.Profile_about;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfileAoutController {

    @Autowired
    ProfileAboutRepository profileAboutRepository;

    @GetMapping("/asd")
    public List testMapping(@PathVariable String test){
        List<Profile_about> profileAbout = profileAboutRepository.findAll();
        return profileAbout;
    }

    @GetMapping("/asd2/{test}")
    public Profile_about testMapping2(@PathVariable int test2){
        Profile_about profileAbout = profileAboutRepository.findAllByUser_id(test2);
        return profileAbout;
    }
}
