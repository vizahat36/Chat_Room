package com.chatboat.chat.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chatboat.chat.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
