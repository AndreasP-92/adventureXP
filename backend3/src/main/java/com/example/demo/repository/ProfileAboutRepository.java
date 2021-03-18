package com.example.demo.repository;

import com.example.demo.model.Profile_about;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileAboutRepository extends JpaRepository<Profile_about, Long> {
Profile_about findAllByUser_id(int user_mail);
}
