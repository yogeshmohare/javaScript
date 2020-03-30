import java.util.*;
class Box{
double width;
double height;
double depth;

 double volume()
{
return width*height*depth;
}
Box(double h,double w,double d)/// parametrize constructor
{
width=w;
height=h;
depth=d;
}
}
class BoxDemo7
{
public static void main(String args[])
{
Box mybox1=new Box(11,32,45);
Box mybox2=new Box(21,33,43);
double vol;



vol=mybox1.volume();
System.out.println("vol is"+vol);

vol=mybox2.volume();
System.out.println("vol is"+vol);



}
}