import java.util.Scanner;
class Main 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        int flag=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='e')
            {
                flag=1;
            }
        }
        if(flag==1) System.out.println("yes");
        else System.out.println("no");
    }
}
