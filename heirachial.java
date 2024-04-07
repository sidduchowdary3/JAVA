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
class chick extends Parent 
{
    public void print3()
    {
        System.out.println("chcik");
    }
}
class Main 
{
    public static void main(String args[])
    {
      child ch = new child();
      ch.print();
      ch.print2();
        chick c=new chick();
        c.print();
        c.print3();
    }
}
