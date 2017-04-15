
public class Game {
    
    private Player red;
    private Player blue;
    private EventLogger eventLogger;
    private DiceManager dice;
    
    public Game() {
        init();
        run();
    }
    
    private void init() {
        this.blue = new Player("BLAU");
        this.red  = new Player("ROT");
        this.eventLogger = new EventLogger();
        this.dice = new DiceManager();
    }
    
    private void run() {
        /**
         * This function will run the game. 
         * Normally, all phases will run and repeat.
         * If the user wants to close, this function returns.
         */
        dicePhase();
        
    }
    
    private void dicePhase() {
        do {
            eventLogger.printRoleDiceInfo(red);
        }while (InputManager.checkInputKey('w') == false);
        red.setDiceValue(dice.rollDice());
        eventLogger.printPlayersDiceValue(red);
        
        do {            
            eventLogger.printRoleDiceInfo(blue);
        } while (InputManager.checkInputKey('w') == false);
        blue.setDiceValue(dice.rollDice());
        eventLogger.printRoleDiceInfo(blue);
        
    }
    
    private void battlePhase() {
        
    }
    
}
