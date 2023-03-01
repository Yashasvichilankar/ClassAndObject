import java.util.Scanner;
class InchToMeter
{
int i;
double m;

void setData()
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the value in inch: ");
i=sc.nextInt();
}
void getData()
{
m=i*0.0254;
System.out.println("The vale in Meter is: "+m+" Meters");
}
public static void main(String args[])
{
InchToMeter a1=new InchToMeter();
a1.setData();
a1.getData();
}
}