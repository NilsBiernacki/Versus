
public class EventLogger {
	private Phase phase;
	
	public EventLogger() {
		
	}
		
	void printRoleDiceInfo(Player p) {
		if (p.getColor().equals("ROT")) {
			System.out.println("Zeit die Würfel zu rollen. ROT du bist drann, drücke 'w' um zu würfeln.");
		}
		else if(p.getColor().equals("BLUE")) {
			System.out.println("OK BLAU, nun bist du am Zug. Viel Glück beim Würfeln. Drücke 'w' um zu würfeln.");
		}
	}
	
	void printPlayersDiceValue(Player p, int diceValue) {
		if (p.getColor().equals("ROT")) {
			System.out.println("Hey ROT, du haste eine " + diceValue + " gewürfelt.");
		}
		if (p.getColor().equals("BLAU")) {
			System.out.println("BLAU, du hast die " + diceValue + " gewürfelt.");
		}
	}
        
        void printPlayersAction(Player p) {
            if (p.getColor().equals("ROT")) {
                        System.out.println("Hey ROT, es wird Zeit BLAU eine Abreibung zu verpassen!\n"
                                + "Drücke 's' um zu schlagen.");
		}
            if (p.getColor().equals("BLAU")) {
			System.out.println("BLAU, du darfst ROT eine verpassen. Und halt dich bloß nicht zurück.\n"
                                + "Drücke 's' um zu schlagen.");
                }
        }
	
}
