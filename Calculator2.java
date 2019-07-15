package sowmya1;
public class Calculator2 
{
	public Calculator2()
	{
		System.out.println("I am the default constructor");//explicit constructor with no argument
	}
	public static void main(String[] args) //method signature
	{
		
		
	 Calculator2 calc=new Calculator2();
      int result=calc.add( );//method calling
      //System.out.println("Total value in the main methiod is:"+calc.add());
       calc.calculatepercentage(calc.add());
	}

	private int calculatepercentage(int r)//method signature
	{
		int percentage=r/2;//method definition
		System.out.println("percentage is:"+percentage);
		return percentage;
	}
	int add()
{
	int no1=100,no2=20,total;
	total=no1+no2;
    System.out.println("Total is "+total);
     return total;
}

	
}