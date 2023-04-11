package com.alexandrestefani.jokenpoii;

import java.util.Random;

public class NumberAleatory {
    int getAleatoryNumber(){
        int numberAleatory = new Random().nextInt(3);
        return numberAleatory;
    }
}
