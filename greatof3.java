import java.util.Scanner;
class Main 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>b && a>c) System.out.println("a is great");
        else if(b>a && b>c) System.out.println("a is great");
        else System.out.println("c is great");
    }
}
