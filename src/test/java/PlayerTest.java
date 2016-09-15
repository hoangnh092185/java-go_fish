import org.junit.*;
import static org.junit.Assert.*;

public class PlayerTest {
  private Player player1 = new Player("Nhat");
  private Player player2 = new Player("Karen");

  @Test
  public void Player_instantiatesCorrectly_true() {
    assertEquals(true, player1 instanceof Player);
  }
  @Test
  public void GetPlayerName_returnCorrectName_Nhat(){
    assertEquals("Nhat", player1.getPlayer());
  }
  @Test
  public void HandsOfCard_ReturnCorrectNumberOfCards_7(){
    // Player newHand = new Player();
    assertEquals(7, player1.startHand().size());
  }
}
