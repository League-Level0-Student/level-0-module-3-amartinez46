
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot r2d2 = new Robot();
	r2d2.penDown();
		r2d2.setPenColor(Color.blue);
		r2d2.setSpeed(30);
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		r2d2.setX (50);
		// 2. Make the robot draw a star shape. Hint: 144.
r2d2.turn(144);
r2d2.move(70);		
r2d2.turn(180);
r2d2.move(70);	
r2d2.turn(144);
r2d2.move(70);	
// 3. Set the size of the star to 30.
r2d2.setPenWidth(30);

/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
