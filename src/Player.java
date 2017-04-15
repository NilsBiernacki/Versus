
public class Player {

	private int health;
	private int attack;
	private String color;
        private int diceValue;

    public int getDiceValue() {
        return diceValue;
    }

    public void setDiceValue(int diceValue) {
        this.diceValue = diceValue;
    }
	
	public Player(String color){
		this.setHealth(100);
		this.setAttack(25);
                this.color = color;
	}
	
	public void hit(Player enemy){
		enemy.setHealth(enemy.getHealth() - this.getAttack());
	}
	
	
	public void setHealth(int value){
		this.health = value;
	}
	
	public void setAttack(int value){
		this.attack = value;
	}
	
	public int getHealth(){
		return this.health;
	}
	
	public int getAttack(){
		return this.attack;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
}
