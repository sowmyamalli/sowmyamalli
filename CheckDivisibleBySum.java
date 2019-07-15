package sowmya1;
import java.util.Scanner;
public class CheckDivisibleBySum {
       int num,i,add;
       int a=0;
       
   public void getInput()
   {
	   Scanner scan=new Scanner (System.in);
	   System.out.println("Enter the number");
	   num=scan.nextInt();
   }
   public void findSumOfdigitAll()
   {
	      
	      int rem=0;  
	      int  temp=num;
		  while(num>0)
		  {
			  rem=num%10;
			  num=num/10;
			  a=a+rem;
		  }
     System.out.println(a);
   

   if(temp%a==0)
   {
	   System.out.println("YES");
   }
   else
   {
	   System.out.println("NO"); 
   }
   }
}

