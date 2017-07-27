package CardShuffle;

/**
 * Created by 민우 on 2017-07-27.
 */
public class Card {
    public final int suitNumber;
    public final int rankNumber;

    public Card(int suitNumber, int rankNumber) {
        this.suitNumber = suitNumber;
        this.rankNumber = rankNumber;
    }

    public String getSuit() {
        String getsuit = null;
        switch (suitNumber) {
            case 1: getsuit="Clubs";    break;
            case 2: getsuit="Hearts";   break;
            case 3: getsuit="Diamonds"; break;
            case 4: getsuit="Spades";   break;
        }
        return getsuit;
    }

    public String getRank() {
        String getrank = null;
        switch (rankNumber){
            case 1: getrank="ACE";  break;
            case 2: getrank="2";    break;
            case 3: getrank="3";    break;
            case 4: getrank="4";    break;
            case 5: getrank="5";    break;
            case 6: getrank="6";    break;
            case 7: getrank="7";    break;
            case 8: getrank="8";    break;
            case 9: getrank="9";    break;
            case 10: getrank="10";  break;
            case 11: getrank="Jack";    break;
            case 12: getrank="Queen";   break;
            case 13: getrank="King";    break;
        }
        return getrank;
    }

    public String toString() {
        return getRank()+" of "+getSuit();
    }
}