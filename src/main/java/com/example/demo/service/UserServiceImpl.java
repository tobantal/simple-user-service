package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    
    private final UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.getAllUsers();
    }

    @Override
    public List<User> getMailRu() {
        return getAll().stream().filter(user -> user.getEmail().contains("mail.ru")).collect(Collectors.toList());
    }

}
