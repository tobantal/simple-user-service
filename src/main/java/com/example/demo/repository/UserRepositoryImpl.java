package com.example.demo.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public List<User> getAllUsers() {
        return Stream.of(new User(1, "Ivan", "ivan@mail.ru"), new User(2, "Oleg", "ooo@gmail.com"),
                new User(3, "Anton", "anton@gmail.com"), new User(4, "Leonid", "leo@mail.ru"),
                new User(5, "Nikolay", "nik@mail.ru")).collect(Collectors.toList());
    }

}
