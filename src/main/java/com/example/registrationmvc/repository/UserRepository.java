package com.example.registrationmvc.repository;

import com.example.registrationmvc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
 User findByEmail(String email);
}
