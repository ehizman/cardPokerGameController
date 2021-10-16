import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameControllerTest {
    @Test
    void twoPairs(){
        Card firstCard = new Card(Face.FIVE, Suit.CLUBS);
        Card secondCard = new Card(Face.FIVE, Suit.DIAMONDS);
        Card thirdCard = new Card(Face.ACE, Suit.CLUBS);
        Card fourthCard = new Card(Face.FOUR, Suit.DIAMONDS);
        Card fifthCard = new Card(Face.FOUR, Suit.DIAMONDS);
        Card[] playerHand = new Card[]{firstCard, secondCard, thirdCard, fourthCard, fifthCard};
        assertTrue(GameController.containsTwoPairs(playerHand));
    }

    @Test
    void aPair(){
        Card firstCard = new Card(Face.FIVE, Suit.CLUBS);
        Card secondCard = new Card(Face.FIVE, Suit.DIAMONDS);
        Card thirdCard = new Card(Face.ACE, Suit.CLUBS);
        Card fourthCard = new Card(Face.SEVEN, Suit.HEARTS);
        Card fifthCard = new Card(Face.SIX, Suit.DIAMONDS);
        Card[] playerHand = new Card[]{firstCard, secondCard, thirdCard, fourthCard, fifthCard};
        assertTrue(GameController.containsAPair(playerHand));
    }

    @Test
    void threeOfAKind(){
        Card firstCard = new Card(Face.QUEEN, Suit.CLUBS);
        Card secondCard = new Card(Face.QUEEN, Suit.DIAMONDS);
        Card thirdCard = new Card(Face.FOUR, Suit.CLUBS);
        Card fourthCard = new Card(Face.QUEEN, Suit.HEARTS);
        Card fifthCard = new Card(Face.SIX, Suit.DIAMONDS);
        Card[] playerHand = new Card[]{firstCard, secondCard, thirdCard, fourthCard, fifthCard};
        assertTrue(GameController.containsThreeOfAKind(playerHand));
    }

    @Test
    void fourOfAKind(){
        Card firstCard = new Card(Face.QUEEN, Suit.CLUBS);
        Card secondCard = new Card(Face.QUEEN, Suit.CLUBS);
        Card thirdCard = new Card(Face.QUEEN, Suit.SPADES);
        Card fourthCard = new Card(Face.QUEEN, Suit.HEARTS);
        Card fifthCard = new Card(Face.SEVEN, Suit.DIAMONDS);
        Card[] playerHand = new Card[]{firstCard, secondCard, thirdCard, fourthCard, fifthCard};
        assertTrue(GameController.containsFourOfAKind(playerHand));
    }

    @Test
    void flush(){
        Card firstCard = new Card(Face.QUEEN, Suit.CLUBS);
        Card secondCard = new Card(Face.SIX, Suit.CLUBS);
        Card thirdCard = new Card(Face.ACE, Suit.CLUBS);
        Card fourthCard = new Card(Face.NINE, Suit.CLUBS);
        Card fifthCard = new Card(Face.KING, Suit.CLUBS);
        Card[] playerHand = new Card[]{firstCard, secondCard, thirdCard, fourthCard, fifthCard};
        assertTrue(GameController.isAFlush(playerHand));
    }

    @Test
    void straight(){
        Card firstCard = new Card(Face.THREE, Suit.CLUBS);
        Card secondCard = new Card(Face.FOUR, Suit.CLUBS);
        Card thirdCard = new Card(Face.SEVEN, Suit.SPADES);
        Card fourthCard = new Card(Face.FIVE, Suit.HEARTS);
        Card fifthCard = new Card(Face.SIX, Suit.DIAMONDS);
        Card[] playerHand = new Card[]{firstCard, secondCard, thirdCard, fourthCard, fifthCard};
        assertTrue(GameController.isAStraight(playerHand));
    }

    @Test
    void isAFullHouse(){
        Card firstCard = new Card(Face.SIX, Suit.CLUBS);
        Card secondCard = new Card(Face.SEVEN, Suit.CLUBS);
        Card thirdCard = new Card(Face.SEVEN, Suit.SPADES);
        Card fourthCard = new Card(Face.SIX, Suit.HEARTS);
        Card fifthCard = new Card(Face.SEVEN, Suit.DIAMONDS);
        Card[] playerHand = new Card[]{firstCard, secondCard, thirdCard, fourthCard, fifthCard};
        assertTrue(GameController.isAFullHouse(playerHand));
    }
}