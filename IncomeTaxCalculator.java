package sowmya1;
/*import java .util.Scanner;
public class IncomeTaxCalculator {
double taxableamount,taxablepayable1,taxablepayable2,incometax,taxablepayable;
void getInput()
{
	Scanner scan=new Scanner (System.in);
	System.out.println("Enter the number");
	taxableamount=scan.nextInt();
}
void findIncometax()
{
	if(taxableamount<=20000)
	{
		taxablepayable=0;
	}
	else 
	{
		if((taxableamount>=20000)&&(taxableamount<=40000))
		{
			taxablepayable1=taxableamount-20000;
			incometax=(taxablepayable*10)/100;
		}
		else if((taxableamount>=40000)&&(taxableamount<=60000))
		{
           int first=20000;
           int next=20000;
           int anothernext=20000;
           double taxablepayable2 = (taxableamount-first)/10;
            double taxablepayable3=(taxablepayable2-next)/20;
           incometax=taxablepayable2+taxablepayable3;
		}
		else(taxableamount>60000)
		{
           
           
           
			
		}
	}
	
}
}
*/


import java .util.Scanner;
public class IncomeTaxCalculator {
       final double TAX_RATE_ABOVE_20K=0.1;
       final double TAX_RATE_ABOVE_40K=0.2;
       final double TAX_RATE_ABOVE_60K=0.3;
       int taxableIncome;
       int taxAmount;
       void calculate()
       {
    	   int taxableIncome;
    	   double taxablepayable;
    	   Scanner scan=new Scanner(System.in);
           System.out.println("Enter the amount");
           taxableIncome=scan.nextInt();
           if(taxableIncome<=20000)
           {
        	   taxablepayable=0;
           }
           else if((taxableIncome<=40000))
           {
        	   taxablepayable=(taxableIncome-20000)*TAX_RATE_ABOVE_20K;
           }
           else if((taxableIncome<=60000))
           {
        	   taxablepayable=(20000)*TAX_RATE_ABOVE_20K+(taxableIncome-40000)*TAX_RATE_ABOVE_40K;
           }
           else
           {
        	   taxablepayable=20000*TAX_RATE_ABOVE_20K+20000*TAX_RATE_ABOVE_40K+(taxableIncome-60000)*TAX_RATE_ABOVE_60K;
           }
           System.out.println(taxablepayable);
           }
 
       public static void main(String[] args)
       {
    	   IncomeTaxCalculator ca=new IncomeTaxCalculator();
    	   ca.calculate();
    	   
       }

}



















