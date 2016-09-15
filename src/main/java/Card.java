public class Card {
  //private String mCard;
  private String mValue;
  private String mSuit;

  public Card(String value, String suit){
    //mCard = card;
    mValue = value;
    mSuit = suit;
  }

  // public String getCard(){
  //   return mCard;
  // }
  public String getValue(){
    return mValue;
  }
  public String getSuit(){
    return mSuit;
  }
}
