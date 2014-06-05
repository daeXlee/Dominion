package Dominion;

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
// Variables
	int numberofCards = 0;
	int PlayerNumber = 0;
	ArrayList<card> temp = new ArrayList<card>();
	ArrayList<card> player1Discard = new ArrayList<card>();
	ArrayList<card> player2Discard = new ArrayList<card>();
	ArrayList<card> player3Discard = new ArrayList<card>();
	ArrayList<card> player4Discard = new ArrayList<card>();
// Constructors
	public discardPile(int numberofCardsAdded, int NumberPlayer)
	{
		PlayerNumber = NumberPlayer;
		numberofCards = numberofCardsAdded + numberofCards;
		// Add more things Later
	}
	
// Methods
	//Accessor Methods
	public ArrayList<card> getPlayer1Cards()
	{
		return player1Discard;
	}
	
	public ArrayList<card> getPlayer2Cards()
	{
		return player2Discard;
	}
	
	public ArrayList<card> getPlayer3Cards()
	{
		return player3Discard;
	}
	
	public ArrayList<card> getPlayer4Cards()
	{
		return player4Discard;
	}
	
	//Get cards from hand
	public void CardsfromHand(ArrayList<card> discardCards, int CardsGiven, int PlayerNumber)
	{
		if(PlayerNumber == 1){
			for(int i = 0; i < CardsGiven; i++)
			{
				player1Discard.add(discardCards.get(i));
			}
		}
		
		if(PlayerNumber == 2){
			for(int i = 0; i < CardsGiven; i++)
			{
				player2Discard.add(discardCards.get(i));
			}
		}
		
		if(PlayerNumber == 3){
			for(int i = 0; i < CardsGiven; i++)
			{
				player3Discard.add(discardCards.get(i));
			}
		}
		
		if(PlayerNumber == 4){
			for(int i = 0; i < CardsGiven; i++)
			{
				player4Discard.add(discardCards.get(i));
			}
		}
	}
	
	//Have a method that gets cards from the store
	public void CardsfromStore(ArrayList<card> boughtCards, int CardsBought, int PlayerNumber)
	{
		if(PlayerNumber == 1){
			for(int i = 0; i < CardsBought; i++)
			{
				player1Discard.add(boughtCards.get(i));
			}
		}
		
		if(PlayerNumber == 2){
			for(int i = 0; i < CardsBought; i++)
			{
				player2Discard.add(boughtCards.get(i));
			}
		}
		
		if(PlayerNumber == 3){
			for(int i = 0; i < CardsBought; i++)
			{
				player3Discard.add(boughtCards.get(i));
			}
		}
		
		if(PlayerNumber == 4){
			for(int i = 0; i < CardsBought; i++)
			{
				player4Discard.add(boughtCards.get(i));
			}
		}
		
	}
	
	//Have a method that gives cards to the deck by creating a temporary card array
	public ArrayList<card> toDeck(int PlayerNumber){
		
		if(PlayerNumber == 1){
			temp = player1Discard;
			player1Discard.clear();
		}
		
		if(PlayerNumber == 2){
			temp = player2Discard;
			player2Discard.clear();
		}
		
		if(PlayerNumber == 3){
			temp = player3Discard;
			player3Discard.clear();
		}
		
		if(PlayerNumber == 4){
			temp = player4Discard;;
			player4Discard.clear();
		}
		
		return temp;
	}
	
	
	
	
	
	
	


}