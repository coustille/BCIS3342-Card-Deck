/****************************************************************
* Card.java
* This class stores a Card's information. Copied from assignment.
* John Young
*  
* Advanced Java Programming - BCIS 3342 - 021
* Unit 6 Assigment
* Due Date: March 2, 2025
****************************************************************/

public class Card
{
  private int num;   // hold a number between 1 and 13

  private char suit; // holds 'C' for clubs, 'D' for diamonds,

                     // 'H' for hearts, 'S' for spades


  //**************************************************


  public Card(int num, char suit)

  {

    this.num = num;

    this.suit = suit;

  } // end Card constructor


  //**************************************************

  // Return the card's value in the form of a concatenated

  // number and character.

  // For example, 1C = ace of clubs, 12H = queen of hearts.

  public String toString()

  {

    return Integer.toString(num) + suit;

  }

} // end class Card

