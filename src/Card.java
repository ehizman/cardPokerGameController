public class Card {
    private final Face face;
    private final Suit suit;

    public Card(Face face, Suit suit){
            this.face = face;
            this.suit = suit;
    }
    @Override
    public String toString(){
        return face+ " of " + suit;
    }

    public Face getFace(){
        return face;
    }

    public Suit getSuit(){
        return suit;
    }
}
