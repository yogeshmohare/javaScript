class OverLoadDemo
{

void test()
{System.out.println("No parameter");
}
void test(int a)
{System.out.println("a :"+a);
}
void test(int a,int b)
{
   System.out.println("a and b: " + a + " " + b);
}
double test(double a)
{
System.out.println("double a: "+a);
return a*a;
}
}
class Overload
{
public static void main(String args[])
{
OverLoadDemo ob=new OverLoadDemo();
double result;

ob.test();
ob.test(10);
ob.test(21,33);
result=ob.test(22.33);
System.out.println("result "+result);

}

}