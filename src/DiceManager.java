
public class DiceManager {
	private int diceNumber;
	
	public DiceManager(){
		
	}
	
	public int rollDice(){
		setDiceNumber((int)(Math.random() * 6) + 1);
		return getDiceNumber();
	}
	
	
	public void setDiceNumber(int value){
		this.diceNumber = value;
	}
	
	public int getDiceNumber(){
		return diceNumber;
	}
}
