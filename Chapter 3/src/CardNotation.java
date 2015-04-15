import java.util.Scanner;

public class CardNotation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the notation of your card in the format {Rank}{Suit}. For example, \"QS\"");
		String card = input.next();
		
		String rank = "error";
		String suit = "error";
		
		if (card.length() == 3) {
			rank = card.substring(0, 2);
			suit = card.substring(2, 3);
		} else {
			rank = card.substring(0, 1);
			suit = card.substring(0, 2);
		}
		
		if (rank.equals("A")) {
			System.out.print("Ace of ");
		} else if (rank.equals("2")) {
			System.out.print("Two of ");
		} else if (rank.equals("3")) {
			System.out.print("Three of ");
		} else if (rank.equals("4")) {
			System.out.print("Four of ");
		} else if (rank.equals("5")) {
			System.out.print("Five of ");
		} else if (rank.equals("6")) {
			System.out.print("Six of ");
		} else if (rank.equals("7")) {
			System.out.print("Seven of ");
		} else if (rank.equals("8")) {
			System.out.print("Eight of ");
		} else if (rank.equals("9")) {
			System.out.print("Nine of ");
		} else if (rank.equals("10")) {
			System.out.print("Ten of ");
		} else if (rank.equals("J")) {
			System.out.print("Jack of ");
		} else if (rank.equals("Q")) {
			System.out.print("Queen of ");
		} else if (rank.equals("K")) {
			System.out.print("King of ");
		} else {
			System.out.println("There was an ");
		}
		
		if (suit.equals("H")) {
			System.out.print("Hearts");
		} else if (suit.equals("C")) {
			System.out.print("Clubs");
		} else if (suit.equals("D")) {
			System.out.print("Diamonds");
		} else if (suit.equals("S")) {
			System.out.print("Spades");
		} else {
			System.out.print("error.");
		}
	}
}
