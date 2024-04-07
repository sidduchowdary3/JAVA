class Parent
{
    public void print()
    {
        System.out.println("parent");
    }
}
class child extends Parent 
{
    public void print2()
    {
        System.out.println("child");
    }
}
class Main 
{
    public static void main(String args[])
    {
        Parent p=new Parent();
        p.print();
        child c=new child();
        c.print();
        c.print2();
    }
}
