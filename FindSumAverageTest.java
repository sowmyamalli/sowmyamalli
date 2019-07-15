package sowmya1;

import java.util.Scanner;

public class FindSumAverageTest {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
	    boolean b=true;
	    int num = 0;
	    int choice,q = 0;
        while(b)
        {
        	FindSumAverage f=new FindSumAverage();
        	f.getInput();
        	for(int i=1;i<num;i++)
        	{
        		System.out.println("enter the number");
        	}
        	System.out.println("Enter your choice");
        	int cho=scan.nextInt();
        	System.out.println("Do you want to continue(y/q)");
        	//char cho=scan.next().charAt(0);
			if(cho==q)
        	{
				
        		f.getvalue();
        	}
        	}
        		
        	
        
        }
	}


