import java.util.Scanner;
class Eo 
{
    public boolean printt(int n)
    {
        if(n%2==0) return true;
        else return false;
    }
}
class Main 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Eo v=new Eo();
        if(v.printt(n)) System.out.println("even");
        else System.out.println("odd");
    }
}
