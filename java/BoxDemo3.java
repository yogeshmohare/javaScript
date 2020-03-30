import java.util.*;
class Box{
double width;
double height;
double depth;

void volume()
{
System.out.print("vol is");
System.out.println(width*height*depth);
}
}
class BoxDemo3
{
public static void main(String args[])
{
Box mybox1=new Box();
Box mybox2=new Box();

System.out.println("entre the value");
Scanner s=new Scanner(System.in);
mybox1.depth=10;
mybox1.height=23;
mybox1.width=32;



mybox2.width=s.nextInt();
mybox2.height=s.nextInt();
mybox2.depth=s.nextInt();

mybox1.volume();
mybox2.volume();

}
}