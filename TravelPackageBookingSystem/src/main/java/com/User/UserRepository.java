package com.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

//Repository: UserRepository
public interface UserRepository extends JpaRepository<User, Long> {
 Optional<User> findByEmail(String email);
}

