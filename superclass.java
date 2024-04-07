class Parent
{
    Parent()
    {
        System.out.println("Parent");
    }
}
class child extends Parent
{
    child()
    {
        super();
        System.out.println("Child");
    }
}
class Main 
{
    public static void main(String args[])
    {
        child c=new child();
    }
}
//calling a function using super()
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
        super.print();
        System.out.println("child");
    }
}
class Main 
{
    public static void main(String args[])
    {
        child c=new child();
        c.print2();
    }
}
