import java.util.Scanner;
class Pallindrome
{
    public boolean pali(int n)
    {
        int org=n;
        int t=0;
        while(n!=0)
        {
            int rem=n%10;
            t=t*10+rem;
            n=n/10;
        }
        if(org==t) return true;
        else return false;
    }
}
class Main 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Pallindrome p=new Pallindrome();
        if(p.pali(n))
        System.out.println(n+"yes");
        else
           System.out.println(n+"no");
    }
}
