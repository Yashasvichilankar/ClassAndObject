import java.util.Scanner;
class MinuteConversion
{
int m,y,d;

void setData()
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the value in Minute: ");
m=sc.nextInt();
}

void getData()
{
y=m/525600;
d=(m/1440)%365;

System.out.println("Conversion of minute in Year is: "+y+" Years");
System.out.println("Conversion of minute to day is: "+d+" Days");
}
public static void main(String args[])
{
MinuteConversion m1=new MinuteConversion();
m1.setData();
m1.getData();
}
}

