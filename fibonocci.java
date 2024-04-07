import java.util.Scanner;
class Fibo 
{
    public int printfib(int n)
    {
        if(n<=1) return n;
        else
        return printfib(n-1)+printfib(n-2);
    }
}
class Main 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n;
        n=s.nextInt();
        Fibo f=new Fibo();
        for(int i=0;i<n;i++)
        {
            System.out.println(f.printfib(i));
        }
    }
}
