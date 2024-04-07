import java.util.Scanner;
class Swap 
{
    public void prints(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping");
        System.out.println(a);
        System.out.println(b);
    }
}
class Main 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        Swap sw=new Swap();
         System.out.println("Before swapping");
        System.out.println(n);
        System.out.println(m);
        sw.prints(n,m);
    }
}
