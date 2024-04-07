class sample
{
    public  sample(int a,int b)
    {
        System.out.println("the sum is: "+(a+b));
    }
     public sample(int a,int b,int c)
    {
        System.out.println("the sum is: "+(a+b+c));
    }
}
class Main 
{
    public static void main(String args[])
    {
        sample s=new sample(1,2);
        sample s1=new sample(1,2,3);
    }
}
