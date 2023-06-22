package com.example.jpaexample.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class UserTest {
    @Test
    void test() {
        Users user = new Users();
        user.setName("asd");
        user.setEmail("test@naver.com");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        Users user1 = new Users(null, "name", "aa@naver.com", LocalDateTime.now(), LocalDateTime.now());
        Users user2 = new Users( "nave", "test@naver.com");

        System.out.println(user);
    }
}