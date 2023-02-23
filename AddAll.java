import java.util.Scanner;
class AddAll
{
int n,sum=0,remain;

void setData()
{
Scanner sc=new Scanner(System.in);
System.out.println("Input an integer between 0 to 1000 : ");
n=sc.nextInt();
}
void getData()
{
while(n>0)
{
remain=n%10;
sum=sum+remain;
n=n/10;
}
System.out.println("The sum of all digit is :"+sum);
}
public static void main(String args[])
{
AddAll a1=new AddAll();
a1.setData();
a1.getData();
}
}
