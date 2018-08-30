package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < robots.length; i++) {
			robots[i].setSpeed(20);
			robots[i].move(-200);
		}
		robots[1].turn(90);
		robots[1].move(200);
		robots[1].turn(-90);
		robots[2].turn(90);
		robots[2].move(100);
		robots[2].turn(-90);
		robots[3].turn(-90);
		robots[3].move(200);
		robots[3].turn(90);
		robots[4].turn(-90);
		robots[4].move(100);
		robots[4].turn(90);
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random random = new Random(50);
		for (int i = 0; i < robots.length; i++) {
			int number = random.nextInt(50);
			robots[i].move(number);
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		boolean notreached = true;
		while (notreached) {
			for (int i = 0; i < robots.length; i++) {
				int number = random.nextInt(50);
				robots[i].move(number);
				if (robots[i].getY() < 0) {
					System.out.println("Robot " + i + " is the winner!");
					notreached = false;
				}
			}
		}
		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
		for (int i = 0; i < robots.length; i++) {
			robots[i].moveTo(450, 500);
			robots[i].turn(90);
		}
		for (int i = 0; i < robots.length; i++) {
			int moves = random.nextInt(100);
			for (int g = 0; g < moves; g++) {
				move(robots[i]);
			}
		}
	}

	static void move(Robot robot) {
		robot.move(15);
		robot.turn(-5);
	}
}
