import java.util.Scanner;
class Average
{
int num1,num2,num3;

void calculate()
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the value of num1: ");
num1=sc.nextInt();

System.out.println("Enter the value of num1: ");
num2=sc.nextInt();

System.out.println("Enter the value of num1: ");
num3=sc.nextInt();

int Avg=(num1+num2+num3)/3;

System.out.println("Average of given three numbers is: "+Avg);
}
public static void main(String args[])
{
Average a1=new Average();
a1.calculate();
}
}
