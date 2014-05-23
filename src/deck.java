import java.util.ArrayList;
import java.util.List;
/*
Name: Jonas Klare

Program: Dominion board game

Class: Deck

deck is the place where all of the cards go to get stored.  It takes from the discard pile and gives to the hand
at the beginning of each turn. 
*/


public class deck 
{
//Variables
	int numberOfCards, size, numberOfPlayer, deckSize;
	List<card> player1Deck, player2Deck, player3Deck, player4Deck, temp;
//Variables
		
//Constructors
	deck(int newNumberOfPlayer)
	{
		numberOfPlayer = newNumberOfPlayer;
		//TODO put 3 estates and 7 copper up in this. 
		deckSize = 10;
	}	
//Constructors
		
//Methods
	//Accessors
	public int getDeckSize()
	{
		return deckSize;
	}
	//Accessors
		
	//Mutators
	public void alterDeckSize(int newDeckSize)
	{
		deckSize = newDeckSize;
	}
	//Mutators
		
	//Other
	public void toHand()
	{
		//TODO allow the user to get cards put in their hand from their deck. 
	}
	public void fromDiscard(List<card> temp, int numberOfPlayer)
	{
		/* gets cards from the discard pile and stores them as the new deck
		 * @param (List<card> temp) contains list of cards
		 * @param (int numberOfPlayer) contains an integer 1-4 signifying the number the player is
		 */

		if(numberOfPlayer == 1)
		{
			player1Deck = temp;
		}
		if(numberOfPlayer == 2)
		{
			player2Deck = temp;
		}
		if(numberOfPlayer == 3)
		{
			player3Deck = temp;
		}
		if(numberOfPlayer == 4)
		{
			player4Deck = temp;
		}
	}
	public List<card> toHand(int newDraw, int numberOfPlayer)
	{
		if(numberOfPlayer == 1)
		{
			size = player1Deck.size();
			for(int d = 0; d<newDraw; d++)
			{
				temp.add(player1Deck.get(d));
			}
		}
		if(numberOfPlayer == 2)
		{
			size = player2Deck.size();
			for(int d = 0; d<newDraw; d++)
			{
				temp.add(player2Deck.get(d));
			}
		}
		if(numberOfPlayer == 3)
		{
			size = player3Deck.size();
			for(int d = 0; d<newDraw; d++)
			{
				temp.add(player3Deck.get(d));
			}
		}
		if(numberOfPlayer == 4)
		{
			size = player4Deck.size();
			for(int d = 0; d<newDraw; d++)
			{
				temp.add(player4Deck.get(d));
			}
		}
		return temp;
	}
	//Other
//Methods
}
