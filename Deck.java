package CardShuffle;

/**
 * Created by 민우 on 2017-07-27.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void print() {
        System.out.println(cards.toString());
    }

    public void shuffle() {
        Random random = new Random();
        Collections.shuffle(cards);
    }

    public Deck deal(int count) {
        Deck hand = new Deck();
        for (int i=51; i>51-count; i--){
            hand.addCard(cards.get(i));
        }
        return hand;
    }
}