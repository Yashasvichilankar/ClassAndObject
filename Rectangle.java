import java.util.Scanner;
class Rectangle
{
int l,w;

void getArea(int l,int w)
{
int A=l*w;
System.out.println("Area of given rectangle is: "+A);
}
public static void main(String args[])
{
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();

r1.getArea(4,8);
r2.getArea(5,8);

}
}
