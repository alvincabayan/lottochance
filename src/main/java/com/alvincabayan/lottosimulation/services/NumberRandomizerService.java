package com.alvincabayan.lottosimulation.services;

import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
@Service
public class NumberRandomizerService {

    // Different randomizer that will return int from 1 to max.
    public Integer random(int max) {
        Random random = new Random();
        int randomInt = random.nextInt(max)+1;
        return randomInt;
    }

    public Integer threadRandom(int max) {
        return  ThreadLocalRandom.current().nextInt(max)+1;
    }

    public Integer mathRandom(int max) {
        return (int) (Math.random()*max)+1;
    }

    public Integer secureRandom(int max) {
        SecureRandom secureRandom = new SecureRandom();
        return (secureRandom.nextInt(max)) +1;
    }

    public Integer randomizer(int max) {
        Integer randomNumber = 1;
        Integer randomizer = secureRandom(4);

        switch (randomizer) {
            case 1:
                randomNumber = random(max);
                break;
            case 2:
                randomNumber = threadRandom(max);
                break;
            case 3:
                randomNumber = mathRandom(max);
                break;
            case 4:
                randomNumber = secureRandom(max);
                break;
            default:
                randomNumber = secureRandom(max);
        }

        return randomNumber;
    }
}
