import java.util.*;
public class Studienberatung{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hast du Abitur?");
		String input = scanner.nextLine();
		if (input.equalsIgnoreCase("n")) {
			System.out.println("Hast du Fachabitur?");
			input = scanner.nextLine();
			if (input.equalsIgnoreCase("n")) {
				System.out.println("Nicht studieren");
			}
		}
	}
}