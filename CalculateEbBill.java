package sowmya1;
import java.util.Scanner;
public class CalculateEbBill {
	int Ebbill,unit;
	final int unit_range_1to100=5;
	final int unit_range_101to200=7;
	final int unit_range_201to300=10;
	final int unit_range_above_300=15;
void getInput()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the unit");
	 unit=scan.nextInt();
}
void findEBbill()
{
	
	if(unit>=100)
	{
		 Ebbill = unit*unit_range_1to100;
	}
	else if((unit>=101)&&(unit<=200))
	{
		
		Ebbill=((100-unit)*unit_range_1to100)+(200-unit)*unit_range_101to200;
	}
	else if((unit>=201)&&(unit<=300))
	{
		Ebbill=((100*unit_range_1to100))+((200*unit_range_101to200)+((300-unit)*unit_range_201to300));
    }
	else {
		Ebbill=((100*unit_range_1to100))+(200*unit_range_101to200)+(300*unit_range_201to300)+((unit-300)*unit_range_above_300);
		  
	}
	System.out.println("Ebbill"+"="+Ebbill);
}
}

