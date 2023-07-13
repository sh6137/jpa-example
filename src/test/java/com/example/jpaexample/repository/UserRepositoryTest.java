package com.example.jpaexample.repository;

import com.example.jpaexample.domain.Users;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Optional;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() {
        Page<Users> users = userRepository.findAll(PageRequest.of(1,3));

        System.out.println("page : " + users);
        System.out.println(users.getTotalElements());
        System.out.println(users.getContent().get(0)) ;
    }

    @Test
    void select(){
//        System.out.println(userRepository.findByName("name"));
//        System.out.println(userRepository.findFirst1ByName("name"));
//        System.out.println(userRepository.findByEmailAndName("test2@naver.com","name2"));
//        System.out.println(userRepository.findByEmailOrName("test2@naver.com","name2"));
//        System.out.println(userRepository.findByIdIsNotNull());
//        System.out.println(userRepository.findByAddressIsNotEmpty());
        System.out.println(userRepository.findByNameIn(Lists.newArrayList("name","name2")));
    }

    @Test
    void pagingAndSortingTest(){
//        System.out.println(userRepository.findTop1ByName("name"));
//        System.out.println(userRepository.findTop1ByNameOrderByIdDesc("name"));
//        System.out.println(userRepository.findFirstByNameOrderByIdDescEmailAsc("name"));
//        System.out.println(userRepository.findFirstByName("name", Sort.by(Sort.Order.desc("id"), Sort.Order.asc("email"))));
        System.out.println(userRepository.findByName("name",PageRequest.of(0,1,Sort.by(Sort.Order.desc("id")))).getContent() );
    }
}