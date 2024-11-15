//LoopStats
//Emmanuel Mok
//November 14th, 2024
//LOOP STATSTATSTATSATSTATASTSTAS(run and input integers)

import java.util.Scanner;

public class LoopStatsRunner
{
	public static void main ( String[] args )
	{
		//creating a loop
		boolean runner = true; 

        while (runner) {  

			Scanner key = new Scanner(System.in);
			System.out.print("Enter a starting number: ");
			int beg = key.nextInt();
			System.out.print("Enter ending number: ");
			int end = key.nextInt();
	
			LoopStats sus = new LoopStats();
			sus.setNums(beg, end);
			System.out.println(sus.toString());

 


            System.out.println("Do you want to run this code again? type Y/N");
			String userinput = key.nextLine();

            if (userinput.equals("N") ) { 
                runner = false;
            }

		}

             

    }

}
