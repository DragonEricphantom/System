package com.example.WebApi.dao.repository;

import com.example.WebApi.dao.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    //    Optional<User> findByUSERNAME(String username);
    User findByUSERNAME(String username);
}
