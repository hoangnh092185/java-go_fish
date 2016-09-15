import org.junit.*;
import static org.junit.Assert.*;

public class DeckTest {

  @Test
  public void Deck_instansiateCorrectly_true(){
    Deck newDeck = new Deck();
    assertEquals(true, newDeck instanceof Deck);
  }

  @Test
  public void Deck_allCardsPresent_52() {
    Deck newDeck = new Deck();
    assertEquals(52, newDeck.getDeck().size());
  }
}
