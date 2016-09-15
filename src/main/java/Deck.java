import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class Deck {
  private String[] values = {"Ace","2","3","4","5","6","7","8","9","10","J","Q","K"};
  private String[] suits = {"diamonds", "clubs", "hearts", "spades"};
  private List<Card> deck = new ArrayList<Card>();
  private Card randomCard;

  public Deck() {
    for(String suit:suits) {
      for(String value:values) {
        Card newCard = new Card(suit, value);
        deck.add(newCard);
      }
    }
  }

  public List<Card> getDeck() {
    return deck;
  }

  public void shuffleDeck() {

  }

  public Card getCard() {
    Random rand = new Random();
    int n = rand.nextInt(52);
    randomCard = deck.get(n);
    return randomCard;
  }
}
