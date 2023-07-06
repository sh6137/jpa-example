package com.example.jpaexample.repository;

import com.example.jpaexample.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    List<Users> findByName(String name);

    Users findByEmail(String email);

    List<Users> findAllByEmail(String email);

    List<Users> findFirst1ByName(String name);

    List<Users> findByEmailAndName(String email, String name);

    List<Users> findByEmailOrName(String email, String name2);

    List<Users> findByIdIsNotNull();
//    List<Users> findByAddressIsNotEmpty();

    List<Users> findByNameIn(List<String> names);
}
