import java.util.*;
import java.util.stream.Collectors;

public class GameController {
    public static boolean containsAPair(Card[] playerHand){
        Set<Face> cardFaces = Arrays.stream(playerHand).map(Card::getFace).collect(Collectors.toSet());
        return cardFaces.size() == 4;
    }

    public static boolean containsTwoPairs(Card[] playerHand) {
        Map<Face, List<Card>> cardFaceListMap =
                Arrays.stream(playerHand).collect(Collectors.groupingBy(Card::getFace));
        final int[] countOfDuplicates = {0};
        cardFaceListMap.forEach((cardFace, cardList) -> {
            if (cardFaceListMap.get(cardFace).size() == 2){
                countOfDuplicates[0]++;
            }
        });
        return countOfDuplicates[0] == 2;
    }

    public static boolean containsThreeOfAKind(Card[] playerHand) {
        Set<Face> cardSet = Arrays.stream(playerHand).map(Card::getFace).collect(Collectors.toSet());
        return cardSet.size() == 3;
    }

    public static boolean containsFourOfAKind(Card[] playerHand) {
        Set<Face> cardFaces = Arrays.stream(playerHand).map(Card::getFace).collect(Collectors.toSet());
        return cardFaces.size() == 2;
    }

    public static boolean isAFlush(Card[] playerHand) {
        Set<Suit> cardSuits = Arrays.stream(playerHand)
                .map(Card::getSuit).collect(Collectors.toSet());
        return cardSuits.size() == 1;
    }

    public static boolean isAStraight(Card[] playerHand) {
        List<Integer> faceValues=
                Arrays.stream(playerHand).map(card -> card.getFace().getFaceValue()).distinct()
                        .sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        return (faceValues.get(faceValues.size() - 1) - faceValues.get(0) == 4)&&(faceValues.size()==5);
    }

    public static boolean isAFullHouse(Card[] playerHand) {
        Set<Face> cardSet = Arrays.stream(playerHand).map(Card::getFace).collect(Collectors.toSet());
        return cardSet.size() == 2;
    }
}
