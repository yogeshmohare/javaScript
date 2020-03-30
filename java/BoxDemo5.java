import java.util.*;
class Box{
double width;
double height;
double depth;

 double volume()
{
return width*height*depth;
}
void setdim(double w,double h,double d)
{
width=w;
height=h;
depth=d;
}
}
class BoxDemo5
{
public static void main(String args[])
{
Box mybox1=new Box();
Box mybox2=new Box();
double vol;


mybox1.setdim(22,33,11);
vol=mybox1.volume();
System.out.println("vol is"+vol);

mybox2.setdim(14,32,11);
vol=mybox2.volume();
System.out.println("vol is"+vol);



}
}