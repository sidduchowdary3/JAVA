abstract class car 
{
    public abstract void sound();
}
class benz extends car 
{
    public void sound()
    {
        System.out.println("high");
    }
}
class audi extends car 
{
    public void sound()
    {
        System.out.println("low");
    }
}
class Main 
{
    public static void main(String args[])
    {
        car b=new benz();
        b.sound();
        car a=new audi();
        a.sound();
    }
}
