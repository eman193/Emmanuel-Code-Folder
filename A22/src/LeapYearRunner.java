import java.util.Scanner; 

public class LeapYearRunner
{
	public static void main( String args[] )
	{//keyboard input stuff
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a year : ");
		int year = keyboard.nextInt();
		// Hawk Tuah! Spit on that thang!
		LeapYear hawktuah = new LeapYear();
		//running the code from the other class
		hawktuah.isLeapYear(year);

	}
}