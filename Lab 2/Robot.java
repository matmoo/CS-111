//"I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone."
// Mateo ID: 50006140
import java.util.Random;

public class Robot {
	private static int numRobots;

	private RobotHead robotHead;
	private RobotTorso robotTorso;
	private String serialID;

	public Robot(){
		numRobots++;
		Random rand2 = new Random();
		int serial = rand2.nextInt(0,100000);
		serialID = "ArmyRobot" + serial;
		robotHead = new RobotHead();
		robotTorso = new RobotTorso();
		





	}

	public void setSerialID (String serial) {
		serialID = serial;

	}
	public String getSerialID () {
		return serialID;

	}
	public static int getRobotCount() {
		return numRobots;

	}
	public Robot copy() {
		Robot robotCopy = new Robot();
		robotCopy.setSerialID(serialID);
		return robotCopy;

	}
	public boolean equals(Robot other){
		
		return serialID.equals(other.serialID);
	}

	public String toString(){
		String str = "Serial ID : " +serialID+", " +robotHead.toString()+", "+robotTorso.toString();
		return str;
		
	}


}
