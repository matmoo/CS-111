//"I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone."
// Mateo ID: 50006140
import java.util.Random;

public class RobotHead {
	private String eyeColor;

	



	public RobotHead () {
		Random rand = new Random();
		int color = rand.nextInt(0,5);
		
		switch (color) {
		
		case 0: eyeColor = "green";
			break;
		case 1: eyeColor = "blue";
			break;
		case 2: eyeColor = "red";
			break;
		case 3: eyeColor = "yellow";
			break;
		case 4: eyeColor = "lightbrown";
			break;

		}
			

		


	}		
		public String toString(){
			String str_color = "Eye Color : " + eyeColor;

			return str_color;

		
	}

}














