import java.util.*;
public class Studienberatung{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hast du Abitur?");
		String input = scanner.nextLine();
		if (input.equalsIgnoreCase("j")) {
			System.out.println("Bist du wissbegierig?");
			input = scanner.nextLine();
			if (input.equalsIgnoreCase("j")) {
				System.out.println("Auf jeden Fall studieren");
			} else {
				System.out.println("Nicht studieren");
			}
		}
	}
}