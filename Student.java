package sowmya1;

public class Student {
	String name;
	int m1,m2,m3,m4,m5,total;
	String address;
	public Student(String name,int m1,int m2,int m3, int m4,int m5,String address)
	{
		System.out.println("Welcome to students zone");
		 this.name=name;
		 this.m1=m1;
		 this.m2=m2;
		 this.m3=m3;
		 this.m4=m4;
		 this.m5=m5;
		 this.address=address;
		}
	public Student( )
	{
		System.out.println("check where i am printed");
	}
	public static void main(String args[]){
		Student s1=new Student("sowmi",90,60,80,70,85,"cnp");
		Student s2=new Student("saran",90,60,80,70,85,"dgl");
		Student s3=new Student();
		s1.display();
		s2.display();
		s3.display();
	}
	private void display()
	{
		System.out.println("student name:"+name);
		System.out.println("student mark1:"+m1);
		System.out.println("student mark2:"+m2);
		System.out.println("student mark3:"+m3);
		System.out.println("student mark4:"+m4);
		System.out.println("student mark5:"+m5);
		System.out.println("student name:"+address);
	}
	
}
/*void deposit()
{
}
void opennewaccount()
{
}
void withdraw()
{
}

}*/


