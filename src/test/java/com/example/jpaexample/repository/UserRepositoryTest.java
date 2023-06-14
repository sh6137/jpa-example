package com.example.jpaexample.repository;

import com.example.jpaexample.domain.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    void crud(){
        userRepository.save(new Users());

        System.out.println(userRepository.findAll());
    }
}