public class Card {
  private String mValue;
  private String mSuit;

  public Card(String value, String suit){

    mValue = value;
    mSuit = suit;
  }

  public String getValue(){
    return mValue;
  }
  public String getSuit(){
    return mSuit;
  }
}
