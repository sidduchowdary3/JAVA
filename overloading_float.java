class sample {
    public double dis(float a, float b) {
        double sum = 0;
        sum = sum + a + b;
        return sum;
    }

    public double dis(float a, float b, float c) {
        double sum = 0;
        sum = sum + a + b + c;
        return sum;
    }
}

class Main {
    public static void main(String args[]) {
        double ans;
        sample s = new sample();
        ans = s.dis(1.23F, 2.22F);
        System.out.println(ans);

        ans = s.dis(1.42F, 2.23F, 3.33F);
        System.out.println(ans);
    }
}
