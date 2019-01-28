package com.springboot.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    public SampleService() {
    }

    public String welcome(String userName) {
        return "welcome "+ userName + "";
    }
}
