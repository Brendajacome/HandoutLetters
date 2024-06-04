package com.example.handoutletters;

import java.util.Random;

public class HelloApplication {

    public static void main(String[] args) {
        int[] cards = new int[40];
        int[][] players = new int[3][5];
        int carddealt;
        int player;
        int round;
        String[] namesofthecards = new String[40];
        namesofthecards[0] = "2 of Hearts";
        namesofthecards[1] = "3 of Hearts";
        namesofthecards[2] = "4 of Hearts";
        namesofthecards[3] = "5 of Hearts";
        namesofthecards[4] = "6 of Hearts";
        namesofthecards[5] = "7 of Hearts";
        namesofthecards[6] = "8 of Hearts";
        namesofthecards[7] = "9 of Hearts";
        namesofthecards[8] = "10 of Hearts";
        namesofthecards[9] = "J of Hearts";
        namesofthecards[10] = "Q of Hearts";
        namesofthecards[11] = "K of Hearts";
        namesofthecards[12] = "As of Hearts";
        namesofthecards[13] = "2 of Diamonds";
        namesofthecards[14] = "3 of Diamonds";
        namesofthecards[15] = "4 of Diamonds";
        namesofthecards[16] = "5 of Diamonds";
        namesofthecards[17] = "6 de of Diamonds";
        namesofthecards[18] = "7 de of Diamonds";
        namesofthecards[19] = "8 de of Diamonds";
        namesofthecards[20] = "9 de of Diamonds";
        namesofthecards[21] = "10 de of Diamonds";
        namesofthecards[22] = "J of Diamonds";
        namesofthecards[23] = "Q of Diamonds";
        namesofthecards[24] = "K of Diamonds";
        namesofthecards[25] = "As of Diamonds";
        namesofthecards[26] = "2 of Clubs";
        namesofthecards[27] = "3 of Clubs";
        namesofthecards[28] = "4 of Clubs";
        namesofthecards[29] = "5 of Clubs";
        namesofthecards[30] = "6 of Clubs";
        namesofthecards[31] = "7 of Clubs";
        namesofthecards[32] = "8 of Clubs";
        namesofthecards[33] = "9 of Clubs";
        namesofthecards[34] = "10 of Clubs";
        namesofthecards[35] = "J of Clubs";
        namesofthecards[36] = "Q of Clubs";
        namesofthecards[37] = "K of Clubs";
        namesofthecards[38] = "As of Clubs";
        namesofthecards[39] = "2 of Spades";

        for (int i = 0; i < 40; i++) {
            cards[i] = i + 1;
        }

        Random random = new Random();


        for (round = 0; round < 5; round++) {
            for (player = 0; player < 3; player++) {

                do {
                    carddealt = random.nextInt(40);
                } while (cards[carddealt] == 0);

                players[player][round] = carddealt;

                cards[carddealt] = 0;
            }
        }

        for (player = 0; player < 3; player++) {
            System.out.println("player " + (player + 1) + ":");
            for (round = 0; round < 5; round++) {
                System.out.println(" round " + (round + 1) + ": card " + namesofthecards[players[player][round]]);
            }
        }
    }
}