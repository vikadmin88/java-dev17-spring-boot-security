package org.springtest.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springtest.data.entity.Note;
import org.springtest.data.entity.User;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("FROM User u WHERE u.username = :username")
    Optional<User> findByUsername(@Param("username") String username);
}

