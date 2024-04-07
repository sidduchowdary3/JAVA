class benz 
{
    public void exhaust()
    {
        System.out.println("BENZ");
    }
}
class audi extends benz 
{
  public void exhaust()
  {
      System.out.println("AUDI");
  }
}
class Main 
{
    public static void main(String args[])
    {
        benz b=new benz();
        audi a=new audi();
        b.exhaust();
        a.exhaust();
    }
}
