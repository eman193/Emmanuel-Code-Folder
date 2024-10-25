
public class LeapYear
{
	public static boolean isLeapYear( int year )
	{
        if ((year % 400) == 0) {
            System.out.println("Yes, this is a leap year.");
            return true;
        }
        else if ((year % 100) == 0) {
            System.out.println("No, this is a century.");
            return false;
        }
        else if ((year % 4) == 0) {
            System.out.println("Yes, this is a leap year.");
            return true;
        } else {
            System.out.println("No, this is not a leap year.");
            return false;
        }
		
	}
}