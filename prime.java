import java.util.Scanner;
class Prime 
{
    public boolean primes(int n)
    {
        if(n<=1) return false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
}
class Main 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        Prime p=new Prime();
        if(p.primes(n)) System.out.println("yes");
        else System.out.println("no");
    }
}
