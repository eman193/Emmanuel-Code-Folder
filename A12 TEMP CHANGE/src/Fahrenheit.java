public class Fahrenheit
{
	private double fahrenheit, celsius, fahrenheit2, celsius2;

	public void setFahrenheit(double fahren1)
	{fahrenheit = fahren1;
	}

	public double getCelsius()
	{
		celsius = (fahrenheit - 32)*(5.0/9);
		return celsius;
	}
    public void setCelsius(double cels1)
	{celsius2 = cels1;
	}

	public double getFahrenheit()
	{
		fahrenheit2 = celsius2*(5.0/9)+32;
		return fahrenheit2;
	}
	public void print()
	{
		System.out.println("Your F to C is: " + getCelsius());
		System.out.println("Your C to F is: " + getFahrenheit());
	}
}