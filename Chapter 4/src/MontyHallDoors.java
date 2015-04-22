import java.util.Random;

public class MontyHallDoors {
	public static void main(String[] args) {
		Random random = new Random();
		
		int wonStay = 0; // counter to track how many times staying was successful
		int wonSwitch = 0; // counter to track how many times switching was successful
		final int SIMULATION_CYCLES = 1000;
		
		int playerChoice = 0; // tracks which door player chose, 1 - 3
		int doorWinner = 0; // tracks which door has the car, 1 - 3
		int hostChoice = 0; // tracks which door the host will reveal

		for (int i = 0; i < SIMULATION_CYCLES; i++) {
			doorWinner = random.nextInt(3) + 1;
			playerChoice = random.nextInt(3) + 1;
			
			do {
				hostChoice = random.nextInt(3) + 1;
			} while (hostChoice == playerChoice || hostChoice == doorWinner);
			
			if (playerChoice != doorWinner) {
				wonSwitch++;
			} else if (playerChoice == doorWinner) {
				wonStay++;
			}
		}
		
		System.out.println("Staying with the first choice wins " + wonStay + " times. " );
		System.out.println("Switching to the unopened door wins " + wonSwitch + " times. ");
	}
}
