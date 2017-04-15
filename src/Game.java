
public class Game {
    
    private Player red;
    private Player blue;
    private EventLogger eventLogger;
    private DiceManager dice;
    
    public Game() {
    
    }
    
    private void init() {
        this.blue = new Player("blue");
        this.red  = new Player("red");
        this.eventLogger = new EventLogger();
        this.dice = new DiceManager();
    }
    
    private void run() {
        /**
         * This function will run the game. 
         * Normally, all phases will run and repeat.
         * If the user wants to close, this function returns.
         */
        
        
    }
    
    private void dicePhase() {
        eventLogger.printPlayersActionInfo(red);
        eventLogger.printPlayersActionInfo(blue);
    }
    
    private void battlePhase() {
        
    }
    
}
