
import java.util.Random;

public class SlotMachine{
	
	
	static int numPlayerWins = 0;
	static int numHouseWins = 0;
	int reels[][];

	public SlotMachine() {
		gambleMachine();
	}

	public void gambleMachine(){
		reels = new int[3][3]; // Declaring the 3x3 array
		
		Random randomNums = new Random(); // Declaring Random Numbers

		for (int i = 0; i < 3; i++){
			for(int l = 0; l < 3; l++){
				reels[i][l] = randomNums.nextInt(9); // creating a for loop to add thier values into the array and adding random Numbers to it 
			}
		}
	}
		


	public boolean isWinner(){ // method checks if the player is a winner
		for( int i = 0; i < 3; i++){
			if(reels[i][0] == reels[i][1] && reels[i][1] == reels[i][2]){ // checks first row winner
				return true;
			}
			
		}
		if(reels[0][0] == reels[1][1] && reels[1][1] == reels[2][2]){ // checks Diagonal
			return true; 

		}
		if(reels[0][2] == reels[1][1] && reels[1][1] == reels[0][2]){ // Checks second row winner
			return true;
		}
		return false;
	}
		
	
}
