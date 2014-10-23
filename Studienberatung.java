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

		} else if (input.equalsIgnoreCase("n")) {
			System.out.println("Hast du Fachabitur?");
			input = scanner.nextLine();
			if (input.equalsIgnoreCase("n")) {
				System.out.println("Nicht studieren");
			} else {
				System.out.println("Hast du eine Berufsausbildung?");
				input = scanner.nextLine();
				if (input.equalsIgnoreCase("n")) {
					System.out.println("Besser noch studieren");
				} else {
					System.out.println("Du kannst später noch studieren");
				}
			}
		}
	}
}