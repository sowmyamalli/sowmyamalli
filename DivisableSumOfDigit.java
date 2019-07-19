package arrayExample;

import java.util.Scanner;

public class DivisableSumOfDigit {
        int[] elements=new int[5];
       int[] digit=new int[5];
        int[] sum=new int[5];
        int[] sum1=new int[5];
        int i,rem;
        Scanner scan=new Scanner(System.in);
	public void getInput()
	{
		for(i=0;i<5;i++)
		{
		    System.out.println("Enter the elements");
		    elements[i]=scan.nextInt();
		    digit[i]=elements[i];
		}
	}
	public void findSumDigit()
	{
		for(i=0;i<5;i++)
		{
			while(elements[i]>0  || sum1[i]>9)
			{
				if(elements[i]==0)
				{
					elements[i]=sum1[i];
					sum1[i]=0;
					
				}
				rem=elements[i]%10;
				sum1[i]=sum1[i]+rem;
				elements[i]=elements[i]/10;
			}
			System.out.println(sum1[i]);
		}
	}
   public void checkDivide()
   {
	   for(i=0;i<5;i++)
	   {
		   if(digit[i]%sum1[i]==0)
		   {
			 System.out.println( "yes");
		   }else{
			   System.out.println("no");
		   }
	   }
       
   }
}
