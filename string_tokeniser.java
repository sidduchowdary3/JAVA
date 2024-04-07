//to print only one token
import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        StringTokenizer st=new StringTokenizer(a,",");
        System.out.println(st.nextToken();
    }
}
//to print the tokens completely
import java.util.Scanner;
import java.util.StringTokenizer;
class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        StringTokenizer st = new StringTokenizer(a, ",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
//to remove the white spaces
import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine(); 
        StringTokenizer st = new StringTokenizer(a, " ", false);
        StringBuilder t = new StringBuilder(); 
        while (st.hasMoreTokens()) {
            t.append(st.nextToken());
        }
        System.out.println(t.toString());
    }
}
