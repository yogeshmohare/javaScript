import java.util.*;
class Box{
double width;
double height;
double depth;
}
class BoxDemo
{
public static void main(String args[])
{
Box mybox1=new Box();
double vol;

mybox1.depth=10;
mybox1.height=23;
mybox1.depth=32;



vol=mybox1.width*mybox1.height*mybox1.width;
System.out.println("volume is "+vol);



}
}