package com.alexandrestefani.jokenpoii;

public class GameEngine {
    String engine(int playerChose,int numberAPP){
        String result = null;
        if(
                (numberAPP == 0 && playerChose == 2)
                || (numberAPP == 1 && playerChose ==0)
                || (numberAPP == 2 && playerChose ==1)) {
            result = "lose";
        } else if (
                (numberAPP == 2 && playerChose == 0)
                ||(numberAPP == 0 && playerChose == 1)
                ||(numberAPP == 1 && playerChose == 2) ){
            result = "win";
        }else{
            result = "draw";
        }
        return result;}
    }

