import java.util.List;
import java.util.ArrayList;

public class Player {
  private String mPlayerName;
  private List<Card> mHand;
  private List<Book> mBooks;
  private boolean isTurn;

  public Player(String name) {
    mPlayerName=name;
    isTurn=false;
    mHand = new ArrayList<Card>();
    mBooks = new ArrayList<Book>();
  }

  public String getPlayer(){
    return mPlayerName;
  }
}
