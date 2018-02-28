
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.omg.Messaging.SyncScopeHelper;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "November 30";
		String dadsBirthday = "Septmber 8";
		String myBirthday = "May 26";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday= JOptionPane.showInputDialog(null, "Which birthday do you want to use?");
		// 3. Print out what the user typed
	if (birthday.equals("mom")) {
		
	System.out.println(birthday);
		System.out.println("Mom's birthday is on November 30");}
		if (birthday.equals("dad")){
			
		System.out.println("Dad's birthday is on September 8");
		}
		if (birthday.equals("me")) {
			System.out.println("My birthday is on May 26");
		}
		else if (birthday.equals("sister")) {
			JOptionPane.showMessageDialog(null,"Sorry I don't know that person's birthday!");
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	}

	private static void SyncScopeHelper(String momsBirthday) {
		// TODO Auto-generated method stub
		
	} 
}
