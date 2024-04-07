package mul;
class ex4 {
    public void square(int x) {
        System.out.println(x * x);
    }

    public void cube(int x) {
        System.out.println(x * x * x);
    }
}
import mul.ex4;
class Main {
    public static void main(String args[]) {
        ex4 e = new ex4();
        e.square(2);
        e.cube(2);
    }
}
