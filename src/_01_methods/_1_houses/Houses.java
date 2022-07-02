package _01_methods._1_houses;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
		
	public void run() {
		Robot rob = new Robot();
		rob.setSpeed(10);
		
		/// first part ////
		rob.hide();
		rob.penDown();
		rob.moveTo(75, 500);
		rob.setPenColor(0, 255, 0);
		rob.setSpeed(5);
		rob.turn(90);
		rob.move(20);
		rob.turn(-90);
		rob.setPenColor(255, 255, 255);
		rob.move(100);
		rob.turn(90);
		rob.move(25);
		rob.turn(90);
		rob.move(100);
		rob.setPenColor(0, 255, 0);
		rob.setSpeed(5);
		rob.turn(-90);
		rob.move(20);
		rob.turn(-90);
		JOptionPane.showMessageDialog(null, "Hello User!");
		
		/// second part ///
		
		for (int i = 0; i < 10; i++) {
			
			/// color ///
			
			String color = JOptionPane.showInputDialog("What color do you want the next house to be? \n (Here is the following options: black, blue, brown, green, red, yellow, and purple): ");
				if (color.equalsIgnoreCase("black")) {
					rob.setPenColor(0, 0, 0);
					
				}else if(color.equalsIgnoreCase("blue")) {
					rob.setPenColor(0, 0, 255);
					rob.penDown();
					
				}else if(color.equalsIgnoreCase("brown")) {
					rob.setPenColor(165, 42, 42);
					rob.penDown();
					
				}else if(color.equalsIgnoreCase("green")) {
					rob.setPenColor(0, 255, 0);
					rob.penDown();
					
				}else if(color.equalsIgnoreCase("red")) {
					rob.setPenColor(255, 0, 0);
					rob.penDown();
					
				}else if(color.equalsIgnoreCase("yellow")) {
					rob.setPenColor(255, 255, 0);
					rob.penDown();
					
				}else if(color.equalsIgnoreCase("purple")) {
					rob.setPenColor(230, 230, 250);
					rob.penDown();
					
				}
				
			/// roof shape /// 
				
			String roofShape = JOptionPane.showInputDialog("What roof shape do you want your next house to have? \n (Here is the following options: pointy or flat): ");
				if (roofShape.equalsIgnoreCase("pointy")) {
					
					String size = JOptionPane.showInputDialog("What size do you want the next house to be? \n (Here is the following options: small, medium, large): ");
					if (size.equalsIgnoreCase("small")) {
						rob.move(25);
						rob.turn(45);
						rob.move(10);
						rob.turn(90);
						rob.move(10);
						rob.turn(45);
						rob.move(25);
						
					}else if(size.equalsIgnoreCase("medium")) {
						rob.move(75);
						rob.turn(45);
						rob.move(50);
						rob.turn(90);
						rob.move(50);
						rob.turn(45);
						rob.move(75);
						
					}else if(size.equalsIgnoreCase("large")) {
						rob.move(300);
						rob.turn(45);
						rob.move(60);
						rob.turn(90);
						rob.move(60);
						rob.turn(45);
						rob.move(300);
					}
					
				}else if(roofShape.equalsIgnoreCase("flat")) {
					
					String size = JOptionPane.showInputDialog("What size do you want the next house to be? \n (Here is the following options: small, medium,large): ");
					if (size.equalsIgnoreCase("small")) {
						rob.move(25);
						rob.turn(90);
						rob.move(10);
						rob.turn(90);
						rob.move(25);
						
					}else if(size.equalsIgnoreCase("medium")) {
						rob.move(75);
						rob.turn(90);
						rob.move(25);
						rob.turn(90);
						rob.move(75);
						
					}else if(size.equalsIgnoreCase("large")) {
						rob.move(300);
						rob.turn(90);
						rob.move(100);
						rob.turn(90);
						rob.move(300);
					}
					
				}
			
			/// grass /// 	
				
			rob.setPenColor(0, 255, 0);
			rob.setSpeed(5);
			rob.turn(-90);
			rob.move(20);
			rob.turn(-90);
		}
		
		
		
	}
	
	}

/// nothing else to do in here /// 
