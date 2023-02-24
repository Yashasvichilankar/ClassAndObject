import java.util.Scanner;
class Area
{
int l;
int b;
int A=l*b;
void setDim()
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the length of rectagle in cm: ");
l=sc.nextInt();

System.out.println("Enter the breadth of rectangle in cm: ");
b=sc.nextInt();
}
void getArea()
{
A=l*b;
System.out.println("Area of Rectangle is: "+A);
}

public static void main(String args[])
{
Area a1=new Area();
a1.setDim();
a1.getArea();
}
}