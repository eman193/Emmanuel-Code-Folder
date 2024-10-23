
import java.util.Scanner; 

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		System.out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		System.out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour test = new MilesPerHour();
        test.setNums(dist, hrs, mins);
        test.calcMPH();
        test.calcKMPH();
		test.print();
		
		
	}
}