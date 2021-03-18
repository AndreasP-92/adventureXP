package backend.demo.repository;

import backend.demo.controller.User2;
import backend.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository2 extends JpaRepository<User2, Long> {

    public User findByEmail(String email);
    public User findByLastName(String lastName);

}
