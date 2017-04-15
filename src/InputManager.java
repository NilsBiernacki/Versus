
import java.util.Scanner;


public class InputManager {
    private static Scanner scanner = new Scanner(System.in);
    
    public static boolean checkInputKey(char sign) {
        
        String var = scanner.next();
        if (var.equals(sign)) {
            return true;
        }
        else {
            return false;
        }
         
    }
}