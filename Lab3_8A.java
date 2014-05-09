// **********************************************************
//   Temps.java
//
//   This program reads in a sequence of hourly temperature 
//   readings (beginning with midnight) and prints the maximum
//   temperature (along with the hour, on a 24-hour clock, it 
//   occurred) and the minimum temperature (along with the hour
//   it occurred).
// **********************************************************

import static java.lang.System.out;
import java.util.Random;

public class Lab3_8A
{
    public static void main (String[] args){
    	
		final int HOURS_PER_DAY = 10;

		int temp = 0, minTemp = 100000, maxTemp = -1000, timeMax = 0, timeMin = 0;   // a temperature reading
	
		for (int hour = 0; hour < HOURS_PER_DAY; hour++){
			
			temp = GetInfo.getInt("Enter temp for hour : " + hour );
			
			if(minTemp > temp){
				minTemp = temp;
				timeMin = hour;
			}
				
			if(maxTemp < temp){
				maxTemp = temp;
				timeMax = hour;
			}
		}
		
		GetInfo.showMessage("Max temp was " + maxTemp + " at hour " + timeMax + "\nMin temp was " + minTemp + " at hour " + timeMin);
    }
}
