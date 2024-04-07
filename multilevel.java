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
class chick extends child 
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
      
        chick c=new chick();
        c.print();
        c.print2();
        c.print3();
    }
}
