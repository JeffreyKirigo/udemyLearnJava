package com.company;

public class Main {

    public static void main(String[] args) {

        calculateHighScorePosition(1500);
        calculateHighScorePosition(900);
        calculateHighScorePosition(400);
        calculateHighScorePosition(50);
    }
    public static void displayHighScorePosition (String playerName,int positionInHighScoreTable) {

        System.out.println(playerName + " managed to get into position " + positionInHighScoreTable +
                " on the High Score table");

    }
    public static int calculateHighScorePosition (int playerScore) {
        if (playerScore >= 1000){
            displayHighScorePosition("Jeffrey Yego",1);
        }
        else if (playerScore >=500 && playerScore < 1000){
            displayHighScorePosition("Julius Yego",2);
        }
        else if (playerScore >=100 && playerScore < 500){
            displayHighScorePosition("Kipchoge Runner",3);
        } else{
            displayHighScorePosition("Lachu",4);
        }
        return playerScore;
    }
}
