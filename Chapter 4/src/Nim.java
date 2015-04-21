import java.util.Scanner;
import java.util.Random;

public class Nim {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		int whoseTurn = random.nextInt(2); // 0 = human, 1 = computer;
		int pileSize = random.nextInt(91) + 10; // 10 to 100
		int intelligence = random.nextInt(2); // 0 = smart, 1 == stupid;
		
		final int SMART = 0;
		final int HUMAN = 0;
		final int COMPUTER = 1;
		
		int removed = 0;
		
		while (pileSize > 0) {
			if (pileSize > 1) {
				System.out.println("There are " + pileSize + " marbles remaining in the pile.");
			} else {
				System.out.println("There is only one marble remaining!");
			}
			
			if (pileSize == 1) {
				if (whoseTurn == HUMAN) {
					System.out.println("You have lost!");
				} else {
					System.out.println("You have defeated the computer and won!");
				}
				
				break;
			}
			
			if (whoseTurn == HUMAN) {
				System.out.print("How many marbles to remove from the pile? ");
				removed = input.nextInt();
				
				while (removed == 0 || removed > pileSize / 2) {
					System.out.print("\nYou can only remove between 1 and " + pileSize / 2 + " marbles. ");
					removed = input.nextInt();
				}
				
				System.out.println("You remove " + removed + " marbles from the pile.");
				pileSize -= removed;
				removed = 0;
				whoseTurn = COMPUTER;
			} else {
				if (intelligence == SMART) {
					// is the pile one less than a power of two? do a random legal move then
					if (pileSize == 3 || pileSize == 7 || pileSize == 15 || pileSize == 31 || pileSize == 63) { 
						removed = random.nextInt(pileSize / 2) + 1;
					} else { // do a smart move
						int count = pileSize - 1;
						int remainder = pileSize - count;
						
						 // run this loop until remainder pile is one less than a power of two
						while (remainder != 3 && remainder != 7 && remainder != 15 && remainder != 31 && remainder != 63) {
							removed = pileSize - count;
							remainder = pileSize - removed;
							count--;
						}
					}
				} else {
					removed = random.nextInt(pileSize / 2) + 1;
				}
				
				System.out.println("The computer removes " + removed + " marbles from the pile.");
				pileSize -= removed;
				removed = 0;
				whoseTurn = HUMAN;
			}
			
			System.out.println();
		}
	}
}
