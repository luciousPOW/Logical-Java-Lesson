package ForPract;

import java.util.Scanner;

public class logical_operator_NOT {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Continue: Yes or No ");
		String response = s.nextLine();
		
		if(!response.equals("Yes") && !response.equals("yes")) {
			System.out.println("You quit the game");
		}
		else {
			System.out.println("Ready for next match");
		}
	
	}

}
