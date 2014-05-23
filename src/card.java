
public class card 
{
//Variables
	int cardCost, cardType, turn, buy, money, draw, cardNumber;
	String cardName, cardAbility;
//Variables
	
//Constructors
	card(int cardCostNew, String cardNameNew, int cardTypeNew, String cardAbilityNew, int cardNumber)
	{
		cardCost = cardCostNew;
		cardName = cardNameNew;
		cardType = cardTypeNew;
		cardAbility = cardAbilityNew;
		turn = 0;
		buy = 0;
		money = 0;
		draw = 0;	
	}
	card(int cardCostNew, String cardNameNew, int cardTypeNew, String cardAbilityNew, int turnNew, int buyNew, int moneyNew, int drawNew, int cardNumber)
	{
		cardCost = cardCostNew;
		cardName = cardNameNew;
		cardType = cardTypeNew;
		cardAbility = cardAbilityNew;
		turn = turnNew;
		buy = buyNew;
		money = moneyNew;
		draw = drawNew;	
	}
//Constructors
	
//Methods
	//Accessors
	public int getCardCost()
	{
		return cardCost;
	}
	public int getCardType()
	{
		return cardType;
	}
	public int getTurn()
	{
		return turn;
	}
	public int getDraw()
	{
		return draw;
	}
	public int getBuy()
	{
		return buy;
	}
	public int getMoney()
	{
		return money;
	}
	public String getCardAbility()
	{
		return cardAbility;
	}
	public String getCardName()
	{
		return cardName;
	}
	public int getCardNumber()
	{
		return cardNumber;
	}
	//Accessors
	
	//Mutators
	public void alterCardCost(int cardCostNew)
	{
		cardCost = cardCostNew;
	}
	public void alterCardType(int cardTypeNew)
	{
		cardType = cardTypeNew;
	}
	public void alterTurn(int turnNew)
	{
		turn = turnNew;
	}
	public void alterDraw(int drawNew)
	{
		draw = drawNew;
	}
	public void alterBuy(int buyNew)
	{
		buy = buyNew;
	}
	public void alterMoney(int moneyNew)
	{
		money = moneyNew;
	}
	public void alterCardAbility(String cardAbilityNew)
	{
		cardAbility = cardAbilityNew;
	}
	public void alterCardName(String cardNameNew)
	{
		cardName = cardNameNew;
	}
	public void alterCardNumber(int cardNumberNew)
	{
		cardNumber = cardNumberNew;
	}
	//Mutators
	
	//Other
	
	//Other
//Methods
}
