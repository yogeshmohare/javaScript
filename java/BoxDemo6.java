import java.util.*;
class Box{
double width;
double height;
double depth;

 double volume()
{
return width*height*depth;
}
Box()/// constructor
{
width=11;
height=24;
depth=20;
}
}
class BoxDemo6
{
public static void main(String args[])
{
Box mybox1=new Box();
Box mybox2=new Box();
double vol;



vol=mybox1.volume();
System.out.println("vol is"+vol);

vol=mybox2.volume();
System.out.println("vol is"+vol);



}
}