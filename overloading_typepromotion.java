class sample {
    public double dis(float a, float b) {
        double sum = 0;
        sum = sum + a + b;
        return sum;
    }

    public double dis(int a, float b) {
        float sum = 0;
        sum = sum + a + b ;
        return sum;
    }
}

class Main {
    public static void main(String args[]) {
        double ans;
        sample s = new sample();
        ans = s.dis(1.23F, 2.22F);
        System.out.println(ans);

        ans = s.dis(1, 2.23F);
        System.out.println(ans);
    }
}
