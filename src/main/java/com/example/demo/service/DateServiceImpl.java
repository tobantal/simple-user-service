package com.example.demo.service;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class DateServiceImpl implements DateService {

    @Override
    public Date getDate() {
        return new Date();
    }

}
