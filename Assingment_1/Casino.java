// Mateo Mora
/* "I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone." */


public class Casino {
	public static void main(String[] args){
	
	SlotMachine[] slotMach = new SlotMachine[1_000_000]; // Creating the Slotmachine and sizing it to 1_000_000

	for(int i = 0; i < slotMach.length; i++){
		slotMach[i] = new SlotMachine(); // setting slotMachine [i] creating a new SlotMachine to check and see if the player is a winner 
		if (slotMach[i].isWinner()){
			SlotMachine.numPlayerWins++;
		}else {
			SlotMachine.numHouseWins++;
		}
		
	}
	System.out.println("PLayer Wins: " + SlotMachine.numPlayerWins); // Displays the results
	System.out.println("House Wins: " + SlotMachine.numHouseWins);

	
	double chanceOfWinning = (double) SlotMachine.numPlayerWins / slotMach.length; // calculates the chances of the player winning
	System.out.println("Chance of player Winning:" + chanceOfWinning);
	
	
	}



}
