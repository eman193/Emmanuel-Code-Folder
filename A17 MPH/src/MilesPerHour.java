//A17 MPH
//Emmanuel Mok
//October 22, 2024
//click run and input some int, your MPH will be in a whole number and your KMPH in two decimals.

public class MilesPerHour
{	
	//state the vars
	private int distance, hours, minutes;
	private double mph, kmph;
	//calculate MPH
	public void calcMPH()
	{
        mph = distance / ((minutes/60.0) + hours);
	}
	//settign numbers
	public void setNums(int dist, int hrs, int mins)
	{
        distance = dist;
        hours = hrs;
        minutes = mins;
	}
	//calc miles into kilometers
	public void calcKMPH()
	{
        kmph = mph * 1.609344;
	}
	//print
	public void print()
	{
        System.out.printf("\n" + distance + " miles in " + hours + " hour and " + minutes + " minutes = " + "%.0f" ,mph);
        System.out.printf("\nThat is = " + "%.2f" ,kmph);
	}
}