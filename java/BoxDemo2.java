import java.util.*;
class Box{
double width;
double height;
double depth;
}
class BoxDemo3
{
public static void main(String args[])
{
Box mybox1=new Box();
Box mybox2=new Box();
double vol;

System.out.println("entre the value");
Scanner s=new Scanner(System.in);
mybox1.depth=10;
mybox1.height=23;
mybox1.width=32;



mybox2.width=s.nextInt();
mybox2.height=s.nextInt();
mybox2.depth=s.nextInt();

vol=mybox1.width*mybox1.height*mybox1.width;
System.out.println("volume is "+vol);
vol=mybox2.width*mybox2.height*mybox2.width;
System.out.println("volume is "+vol);

}
}