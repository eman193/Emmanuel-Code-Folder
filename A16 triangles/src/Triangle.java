import java.lang.Math;
public class Triangle
{
	private int sideA, sideB, sideC;
	private int perimeter;
	private double theArea;

	public void setSides(int a, int b, int c)
	{
		sideA = a;
		sideB = b;
		sideC = c;
	}

	public void calcPerimeter()
	{
		perimeter = sideA+sideB+sideC;
	}

	public void calcArea()
	{
		int s = perimeter/2;
		theArea = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));

	}

	public void print( )
	{
		System.out.printf("\nThe perimeter is: " + perimeter + "\nThe area is: " + "%.2f" ,theArea);
	}
}