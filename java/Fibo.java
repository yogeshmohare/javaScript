public class Fibo
{
public static void main(String[] args)
{


int i,n,t1=0,t2=1,nextTerm;
n=5;
System.out.println("Fibonaci series :");

for(i=1;i<=n;++i)
{
System.out.println("first"+t1);
nextTerm=t1+t2;
t1=t2;
t2=nextTerm;
}
}
}