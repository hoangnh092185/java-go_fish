import org.junit.*;
import static org.junit.Assert.*;

public class CardTest {

  @Test
  public void Card_instansiateCorrectly_true(){
    Card newCard = new Card("King", "Heart");
    assertEquals(true, newCard instanceof Card);
  }
  @Test
  public void GetCardValue_ReturnCorrectCardValue_Heart(){
    Card newCard = new Card("King", "Heart");
    assertEquals("Heart", newCard.getSuit());
  }
  @Test
  public void GetCardValue_ReturnCorrectCardValue_King(){
    Card newCard = new Card("King", "Heart");
    assertEquals("King", newCard.getValue());
  }
}
