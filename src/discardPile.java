import java.util.ArrayList;
import java.util.List;

/*
Name: Jonas Klare

Program: Dominion board game

Class: discardPile

discardPile is the class that is created for each seperate player.  It consists of a name, and an array of cards
The array of cards stores all of the cards that are in each discard pile, and includes classes that allow it 
to transfer cards from the hand to the discard pile and from the discard pile to the deck, because of the recycling
aspect in dominion. It also has mutators and accessors for all variables that this includes. 
*/

public class discardPile 
{
//Variables
	int numberOfCards, length, numberOfPlayer;
	String name;
	List<card> player1Discard = new ArrayList<card>();
	List<card> temp = new ArrayList<card>();
	List<card> player2Discard, player3Discard, player4Discard;
	boolean isShuffled = false;
//Variables

//Constructors
	discardPile(String newName, int newNumberOfPlayer)
	{
		
		name = newName;
		numberOfPlayer = newNumberOfPlayer;
	}
//Constructors

//Methods
	//Accessors
	public String getName()
	{
		return name;
	}
	public List<card> getPlayer1Discard()
	{
		return player1Discard;
	}
	public boolean isShuffled()
	{
		return isShuffled;
	}
	//Accessors
	
	//Mutators
	public void alterDiscardName(String newDiscardName)
	{
		name = newDiscardName;
	}
	public void alterIsShuffled(boolean newIsShuffled)
	{
		isShuffled = newIsShuffled;
	}
	//Mutators
	
	//Other
	public void discardCards(int numberOfPlayer, List<card> discard)
	{
		/* discardCards
		 * discardCards makes it so then cards that are discarded from the hand are placed into the discard pile
		 * @param (int numberOfPlayer) An int 1-4, which is respective to the players number
		 * @param (List<card> discard) contains all of the cards that are being discarded by the user. 
		 */

		if(numberOfPlayer == 1)
		{
			for(int i = 0; i < discard.size(); i++) //While i is less than the size of discard.  This allows it to effectively itterate through every item in discard. 
			{
				player1Discard.add(discard.get(i));
				//Places cards from the input (from the hand class) that will take each card and put it in the discard pile
			}
			System.out.println("Cards have been transferred from hand to discard pile. ");
		}
		if(numberOfPlayer == 2)
		{
			for(int i = 0; i < discard.size(); i++) //While i is less than the size of discard.  This allows it to effectively itterate through every item in discard. 
			{
				player2Discard.add(discard.get(i));
				//Places cards from the input (from the hand class) that will take each card and put it in the discard pile
			}
			System.out.println("Cards have been transferred from hand to discard pile. ");
		}
		if(numberOfPlayer == 3)
		{
			for(int i = 0; i < discard.size(); i++) //While i is less than the size of discard.  This allows it to effectively itterate through every item in discard. 
			{
				player3Discard.add(discard.get(i));
				//Places cards from the input (from the hand class) that will take each card and put it in the discard pile
			}
			System.out.println("Cards have been transferred from hand to discard pile. ");
		}
		if(numberOfPlayer == 4)
		{
			for(int i = 0; i < discard.size(); i++) //While i is less than the size of discard.  This allows it to effectively itterate through every item in discard. 
			{
				player4Discard.add(discard.get(i));
				//Places cards from the input (from the hand class) that will take each card and put it in the discard pile
			}
			System.out.println("Cards have been transferred from hand to discard pile. ");
		}
	}
	public List<card> toDeck(int numberOfPlayer)
	{
		/* toDeck
		 * toDeck takes the users discard pile and returns a List with it, that in the deck class will be used to create a new arrayList. 
		 * @param (int numberOfPlayer) An int 1-4, which is respective to the players number
		 */
		if(numberOfPlayer == 1)
		{
			isShuffled = true;
			temp = player1Discard;
			player1Discard.clear();
		}
		if(numberOfPlayer == 2)
		{
			isShuffled = true;
			temp = player2Discard;
			player2Discard.clear();
		}
		if(numberOfPlayer == 3)
		{
			isShuffled = true;
			temp = player3Discard;
			player1Discard.clear();
		}
		if(numberOfPlayer == 4)
		{
			isShuffled = true;
			temp = player4Discard;
			player1Discard.clear();
		}
		return temp;
	}
	//Other
//Methods
}
