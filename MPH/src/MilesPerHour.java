//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private double distance, hours, minutes;
	private double time, mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist, hrs, mins);

		calcMPH();

		print();
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;

		hours = hrs;

		minutes = mins;

	}

	public void calcMPH()
	{
		time = hours + (minutes / 60);
		mph = distance / time;
	}

	public void print()
	{
		System.out.println("");
		System.out.println((int)distance + " miles in " + (int)hours + " hours and " + (int)minutes + " minutes = " + (int)mph + " MPH.");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return " ";
	}
}