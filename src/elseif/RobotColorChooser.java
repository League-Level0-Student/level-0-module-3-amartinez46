//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot r2d2= new Robot();
		//3. Ask the user what color they would like the robot to draw
for (int i = 0; i <6 ; i++) {
	String pen= JOptionPane.showInputDialog(null, "What color would you like?");
		//5. Use an if/else statement to set the pen color that the user requested
 
	if (pen.equals("pink")) {
		r2d2.setPenColor(Color.pink);
	}
	else if (pen.equals("blue")) {
	r2d2.setPenColor(Color.blue);
}
	else if (pen.equals("pink")) {
	r2d2.setPenColor(Color.pink);
}
	else if (pen.equals("black")) {
	r2d2.setPenColor(Color.black);
}        //6. If the user doesn’t enter anything, choose a random color
	else if (pen.equals("magenta")) {
	r2d2.setPenColor(Color.MAGENTA);
}
	else {
r2d2.setRandomPenColor();
	}
	
	//7. Put a loop around your code so that you keep asking the user for more colors & drawing them
	
		//4. Set the pen width to 10
		r2d2.setPenWidth(10); 
	    //2. Make the robot draw a shape (this will take more than one line of code)
r2d2.penDown();
	r2d2.move(110);
	r2d2.turn(90);
	r2d2.move(110);
	r2d2.turn(90);
	r2d2.move(110);
	r2d2.turn(90);
	r2d2.move(110);
	
	}
}
}