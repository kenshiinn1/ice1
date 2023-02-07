package exercise1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks
 * the user to pick a card. It then searches the array of cards for the match to
 * the user's card. To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] hand = new Card[7];

        Random rankgenerator = new Random();
        Random suitgenerator = new Random();

        System.out.println("pick a card");

        Scanner pick = new Scanner(System.in);
        int mypick = pick.nextInt();

        System.out.println("pick a suit");

        int mysuit = pick.nextInt();

        for (int i = 0; i < hand.length; i++) {

            String suits = Card.SUITS[suitgenerator.nextInt(4)];
            int rank = Card.VALUE[rankgenerator.nextInt(13)];

            Card generatedcard = new Card(suits, rank);

            if (Arrays.asList(hand).contains(generatedcard)) {
                i--;

            } else {

                System.out.println(new Card(suits, rank));
                hand[i] = new Card(suits, rank);
            }

            //       Don't worry about duplicates at this point
        }
        if (Arrays.asList(hand).contains(new Card(Card.SUITS[mysuit], Card.VALUE[mypick]))) {

            printInfo();

        } else {
            System.out.println("not found");

        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        // If the guess is successful, invoke the printInfo() method below.
    }

    /**
     * A simple method to print out personal information. Follow the
     * instructions to replace this information with your own.
     *
     * @author Paul Bonenfant Jan 2022 *
     */
   
    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println("I'm climber");
        System.out.println("My name is Carlos, but you can call me doctor karlos or sir");
        System.out.println();
        System.out.println("My career ambitions: are making games");
        System.out.println();


    }
}
