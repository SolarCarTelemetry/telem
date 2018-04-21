package solarcartelemetry;

import java.io.*;
import java.util.Scanner;

//Original Source code From: http://www.newthinktank.com/2012/04/java-video-tutorial-32/


public class Fileio
{
	
	// class that defines all the fields for my customer
	public static class Parameters
        {
		public int speed;
                public int rpm;
                public int voltage;
		// constructor that's called when a customer is made
		public Parameters(int spd, int rpm, int voltage)
                {
			this.speed = spd;
                        this.rpm = rpm;
                        this.voltage = voltage;
		}
                
                
                public void createParameters(Parameters speed, PrintWriter custOutput)
                {
		// Create the String that contains the customer info
		String custInfo = (Integer.toString(speed.speed) + "\t" + Integer.toString(speed.rpm) + "\t" + Integer.toString(speed.voltage));
		
		// Writes the string to the file
		custOutput.println(custInfo);
                }   
	}
        
	// Create the file and the PrintWriter that will write to the file
	public static PrintWriter createFile(String fileName){
		
		try{
			File parametersList = new File(fileName);
			PrintWriter infoToWrite = new PrintWriter(new BufferedWriter(new FileWriter(parametersList)));
                        //Printwriter allows us to print into a file
			return infoToWrite;
		}
	
		// You have to catch this when you call FileWriter
		
		catch(IOException e)
                {
			System.out.println("An I/O Error Occurred");
			System.exit(0);
		}
		return null;
	}	
}