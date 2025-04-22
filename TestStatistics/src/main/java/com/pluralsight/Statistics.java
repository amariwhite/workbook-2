package com.pluralsight;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Statistics {
    public static void main(String[] args) {
        int[] testScores = {55,66,78,91,90,100,64,81,72,57};

        int sum = 0;
        int highestScore = testScores[0];
        int lowestScore = testScores[0];

        for (int score : testScores){
            sum += score;
            if(score > highestScore){
                highestScore = score;
            }
            if(score < lowestScore){
                lowestScore = score;
            }
        }
        double average = sum/ testScores.length;
        System.out.println("The Average Score is: " + average);
        System.out.println("The Highest Score is: " + highestScore);
        System.out.println("The Lowest Score is: " + lowestScore);
    }


}
