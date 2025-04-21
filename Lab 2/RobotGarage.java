//"I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone."
// Mateo ID: 50006140
public class RobotGarage {
	public static void main(String[] args){
		Robot[] robots = new Robot[3];

		robots[0] = new Robot();
		robots[1] = new Robot();

		Robot copyRobot = robots[0].copy();

		robots[2] = copyRobot;

		System.out.println(robots[0].toString());
		System.out.println(robots[1].toString());
		System.out.println(robots[2].toString());

		System.out.println("Number of Robots in the garage : " + Robot.getRobotCount());


		if (robots[0].equals(robots[1])){
			System.out.println("The First and the Second Robots are the Same");

		}
		if (robots[0].equals(robots[2])){
			System.out.println("The First and the Third are the Same");

		}
		if (robots[1].equals(robots[2])){
			System.out.println("The Second and the Third are the Same");

		} 
	
	}
}	
