package sowmya1;

import java.util.Scanner;

public class GrossSalary {
	float salary,HRA,DA,Gross_salary;
	void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the salary");
		salary=scan.nextInt();
	}
	void display()
	{
		if(salary<=10000)
		{
			HRA=(salary*20)/100;
			DA=(salary*90)/100;
			System.out.println("The Gross salary is" +(salary+HRA+DA));
		}
		else if(salary<=20000)
		{

			HRA=(salary*25)/100;
			DA=(salary*80)/100;
			System.out.println("The Gross salary is" +(salary+HRA+DA));
		}
		else if(salary>=20000){

			HRA=(salary*30)/100;
			DA=(salary*95)/100;
			System.out.println("The Gross salary is" +(salary+HRA+DA));
	
		}
		
		
	}
		
	
}


