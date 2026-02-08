/****************************************************************
* Deck.java
* This class simulates a deck - it loads 13 cards of each suit,
* returns a string of the cards in the deck, and returns a string
* of the dealt card.
* John Young
*   
* Advanced Java Programming - BCIS 3342 - 021
* Unit 6 Assigment
* Due Date: March 2, 2025
****************************************************************/
import java.util.ArrayList;

class Deck {
  // instance variable - Store the cards in the deck as an ArrayList
  private ArrayList<Card> cards = new ArrayList<Card>();

  // Constructor: creates a deck of 52 cards.
  //**************************************************
  public Deck(){
    cards = new ArrayList<Card>();
      for(int j = 1; j <= 4; j++){
        switch (j){
          case 1:
            loadCard('C');  // Create 13 cards with clubs
            break;
          case 2:
            loadCard('D');  // Create 13 cards with diamonds
            break;
          case 3:
            loadCard('H');  // Create 13 cards with hearts
            break;
          case 4:
            loadCard('S');  // Create 13 cards with spades
            break;
        }
      }
  }  // end constructor
  //**************************************************

  // Adds a suit of cards to the deck.
  public void loadCard (char suit){
      for(int i = 1; i <= 13; i++){
        cards.add(new Card(i, suit));
      }
  }  // end loadCard
  //**************************************************

  // Returns all the cards in the deck via a string.
  public String toString(){
    String deckString = "";
    int cardCounter = 0;
    for(Card card : cards){
      if (cardCounter <  5) {  // Print 5 cards per line
        deckString += card.toString();  // Add the next card to the string
        deckString += " ";
        cardCounter++;
      } else {  // Print a new line after 5 cards
          deckString += "\n";
          deckString += card.toString();  // Add the next card to the string
          deckString += " ";
          cardCounter = 1;
      }
    }
    return deckString;
  }  // end printDeck
  //**************************************************

  // Returns a dealt card and removes it from the deck.
  public String dealCard(){
    return cards.remove(cards.size()-1).toString();
  } // end dealCard
  //**************************************************  
  
}  // end class Deck