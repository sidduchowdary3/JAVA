import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        System.out.println(a.indexOf('i'));
        System.out.println(a.lastIndexOf('i'));
        System.out.println(a.lastIndexOf(','));
    }
}
