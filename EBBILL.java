import java.util.*;
class EBBILL
{
 public static void main(String args[])
{
 double a,a1,a2,a3,a4,a5,a6,x,x1,x2,x3,x4,x5,x6;
 String name; 	 //Initialized the String name variable for store the name
 int ebno;		 //Initialized the int ebno variable for store the EB number
 int unit=1;	 //Initialized the int unit variable for store the unit 
 int preunit;	 //Initialized the int preunit variable for store the previous month unit
 int curtunit;	 //Initialized the int curtunit variable for store the current month unit
 double amount=1.00;	 //Initialized the float amount variable for store the amount
 double y=100*2.25;
 double z=200*4.50;
 double m=100*6.00;
 double n=100*8.00;
 double l=200*9.00;
 double o=200*10.00;
 double p=300*4.50;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Customer name:");
 name=sc.nextLine();
 System.out.println("Enter the Eb number:");
 ebno=sc.nextInt();
 System.out.println("Enter the previous month noticed unit:");
 preunit=sc.nextInt();
 System.out.println("Enter the current month noticed unit:");
 curtunit=sc.nextInt();
 unit=curtunit-preunit;
 System.out.println("Units Consumed:"+unit);
 
 if(unit<=100)
{
 amount=unit*0;
}
 else if(unit<=200)
{
 a=unit-100;
 x=a*2.25;
 amount=x;
}
else if(unit<=400)
{

 a1=unit-200;
 x1=a1*4.50;
 amount=x1+y;
}
else if(unit<=500)
{
 a2=unit-400;
 x2=a2*6.00;
 amount=x2+y+z;
}
else if(unit<=600)
{
 a3=unit-500;
 x3=a3*8.00;
 amount=x3+p+m;
}
else if(unit<=800)
{
 a4=unit-600;
 x4=a4*9.00;
 amount=x4+p+m+n;
}
else if(unit<=1000)
{
 a5=unit-800;
 x5=a5*10.00;
 amount=x5+p+m+n+l;
}
else
{
 a6=unit-1000;
 x6=a6*11.00;
 amount=x6+p+m+n+l+o;
}
System.out.println("Bill Amount="+amount);
}
}