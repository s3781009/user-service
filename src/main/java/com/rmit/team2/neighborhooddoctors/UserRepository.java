package com.rmit.team2.neighborhooddoctors;

import com.rmit.team2.neighborhooddoctors.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository  extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.email=?1 AND u.password=?2")
    Optional<User>  findByCredentials(String email, String password);

    @Query("SELECT u FROM User u WHERE u.email=?1 ")
    Optional<User>  findByEmail(String email);
}
