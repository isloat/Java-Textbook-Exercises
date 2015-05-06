import java.util.*;

/* Bulgarian Solitaire starts with 45 cards. We'll randomly divide them into some
 * number of piles -- doesn't matter how much -- then continuously do this step of iteration:
 * take one card from each pile and create a single new pile with these cards.
 * 
 * The game ends when there are piles of size 1 through 9 in any order. 
 * 
 * We will show that this endstate is always reachable.
*/
public class BulgarianSolitaire {
	public static void main(String[] args) {
		Random random = new Random();
		
		final int NUMBER_CARDS = 45;
		ArrayList<Integer> piles = new ArrayList<Integer>();
	
		int cardsRemaining = NUMBER_CARDS;
		int cardsRemoved = 0;
		
		while (cardsRemaining > 0) { // populate the array
			cardsRemoved = random.nextInt(cardsRemaining) + 1;
			cardsRemaining -= cardsRemoved;
			piles.add(cardsRemoved);
		}

		printPiles(piles);
		
		while (keepPlaying(piles)) {
			for (int i = 0; i < piles.size(); i++) {
				piles.set(i, piles.get(i) - 1); // decrement all piles
			}
			
			piles.add(piles.size());
			
			for (int i = 0; i < piles.size(); i++) { // crush zeroes
				if (piles.get(i) == 0) {
					piles.remove(i);
					i--;
				}
			}

			printPiles(piles);
		}
	}
	
	public static void printPiles(ArrayList<Integer> piles) {
		for (int i = 0; i < piles.size(); i++) {
			if (i != piles.size() - 1) {
				System.out.print(piles.get(i) + ", ");
			} else {
				System.out.print(piles.get(i) + "\n");
			}
		}
	}
	
	public static boolean keepPlaying(ArrayList<Integer> piles) { // see if we hit 1 2 3 4 5 6 7 8 9 
		if (piles.size() != 9) return true; // we know we need 9 piles
		
		for (int i = 0; i < piles.size(); i++) { // of differing values
			for (int j = i + 1; j < piles.size(); j++) {
				if (piles.get(i) == piles.get(j)) return true; // duplicate values mean we're not done 
			}
		}
		
		return false; // passed both tests? we're done with the game
	}
}
