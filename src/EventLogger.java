
public class EventLogger {
	private Phase phase;
	
	public EventLogger() {
		
	}
		
	void printRoleDiceInfo(Player p) {
		if (p.getColor() == "ROT") {
			System.out.println("Zeit die Würfel zu rollen. ROT du bist drann, drücke 'w' um zu würfeln.");
		}
		else if(p.getColor() == "BLUE") {
			System.out.println("OK BLAU, nun bist du am Zug. Viel Glück beim Würfeln. Drücke 'w' um zu würfeln.");
		}
	}
	
	void printPlayersDiceValue(Player p, int diceValue) {
		if (p.getColor() == "ROT") {
			System.out.println("Hey ROT, du haste eine "+ diceValue + " gewürfelt.");
		}
		if (p.getColor() == "BLAU") {
			System.out
		}
	}
	
}
