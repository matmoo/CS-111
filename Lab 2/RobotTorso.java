// "I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone."//
// Mateo ID: 50006140
import java.util.Random;


public class RobotTorso {
	
	// feild
	private int numArms;




	public RobotTorso(){
	
	Random rand = new Random();
	numArms = rand.nextInt(0,10);

	}
	public String toString(){

		String str = "Number of arms : " + numArms;

		return str;
		
		
	}

}
