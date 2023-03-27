package com.example.easyapp.controllers;

import com.example.easyapp.entity.Osoba;
import com.example.easyapp.repository.OsobaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class IndexController {
    private OsobaRepository osobaRepository;

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/osoba")
    public String getOsoba() {
        return this.osobaRepository.findAll().get(0).getName();
    }
}
