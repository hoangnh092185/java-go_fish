import java.util.List;
import java.util.ArrayList;

public class Player {
  private String mPlayerName;
  private List<Card> mHand;
  private List<Book> mBooks;
  private boolean isTurn;
  private static List<Player> instances = new ArrayList<Player>();

  public Player(String name) {
    mPlayerName=name;
    isTurn=false;
    mHand = new ArrayList<Card>();
    mBooks = new ArrayList<Book>();
    instances.add(this);
  }
  public String getPlayer(){
    return mPlayerName;
  }
  public static List<Player>all(){
    return instances;
  }
  public static void clear(){
    instances.clear();
  }

}
