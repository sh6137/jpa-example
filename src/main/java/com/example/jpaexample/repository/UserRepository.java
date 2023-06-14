package com.example.jpaexample.repository;

import com.example.jpaexample.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

}
