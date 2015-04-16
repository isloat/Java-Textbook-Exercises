import java.util.Scanner;

public class LeFrench {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the French name of your country: ");
		String country = input.nextLine();
		String article = "";
		String first = country.substring(0,1);
		int length = country.length();
		String last = country.substring(length - 1, length);
		
		if (country.equals("Etats-Unis") || country.equals("Pays-Bas")) {
			article = "les ";
		} else if (country.equals("Belize") || country.equals("Cambodge") || country.equals("Mexique") 
				|| country.equals("Mozambique") || country.equals("Zaire") || country.equals("Zimbabwe")) {
			article = "le ";
		} else if (first.equals("A") || first.equals("E") || first.equals("I") || first.equals("O") || first.equals("U")) {
			article = "l'";
		} else if (last.equals("e")) {
			article = "la ";
		} else {
			article = "le ";
		}
		
		System.out.println(article + country);
	}
}
