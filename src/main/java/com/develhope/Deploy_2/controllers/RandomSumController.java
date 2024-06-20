package com.develhope.Deploy_2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandomSumController {

    @GetMapping("/random-sum")
    public int getRandomSum() {
        Random random = new Random();
        int num1 = random.nextInt(100); // Genera un numero casuale tra 0 e 99
        int num2 = random.nextInt(100); // Genera un numero casuale tra 0 e 99
        return num1 + num2;
    }
}

