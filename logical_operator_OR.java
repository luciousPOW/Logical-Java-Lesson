package ForPract;
import java.util.Scanner;
public class logical_operator_OR {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("You are playing a game! Press q or Q to quit");
		String response = s.nextLine();
		
		if(response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the game");
		}
		else {
			System.out.println("You are still playing the game");
		}
	}

}
