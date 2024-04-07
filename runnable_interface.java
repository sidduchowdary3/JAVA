class sample1 implements Runnable 
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread());
        }
        try 
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
class sample2 implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread());
            System.out.println("class2");
        }
        try{
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
class Main 
{
    public static void main(String args[])
    {
        sample1 s=new sample1();
        sample2 i=new sample2();
        Thread t1=new Thread(s);
        Thread t2=new Thread(i);
        t1.start();
        t2.start();
    }
}
