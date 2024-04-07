import java.util.Scanner;
class Factorial 
{
    public int printfact(int n)
    {
        if(n==1 ||  n==0) return n;
        else 
        return n*printfact(n-1);
    }
}
class Main 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Factorial f=new Factorial();
        System.out.println(f.printfact(n));
    }
}
