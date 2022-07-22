package com.java.site.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.site.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
