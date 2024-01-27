package ForPract;
import java.util.Scanner;
public class logical_operator_AND {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Temperature: ");
		int temp = s.nextInt();
		
		if (temp > 30) {
			System.out.println("It is hot");
		}
		else if (temp >=20 && temp <= 30) {
			System.out.println("It is warm");
		}
		else {
			System.out.println("It is cold");
		}

	}

}
