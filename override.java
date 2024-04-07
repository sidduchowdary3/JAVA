class parent 
{
    public void print()
    {
        System.out.println("parent");
    }
}
class child 
{
    public void print()
    {
        System.out.println("child");
    }
}
class Main 
{
    public static void main(String args[])
    {
        parent p=new parent();
        p.print();
        child c=new child();
        c.print();
    }
}
