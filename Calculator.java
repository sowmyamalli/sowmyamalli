package sowmya1;

public class Calculator 
{
	public static void main(String[]args)
	{ 
		Calculator calc = new Calculator();
		System.out.println("inside  main block");
	}
	
	{
	System.out.println("Inside instance block");
	}
	
	static
	{
		System.out.println("Inside static block 1");
	}
	static
	{
		System.out.println("Inside static block 2");
	}
	static
	{
		System.out.println("Inside static block 3");
	}
	

}
