interface shape 
{
    public void area();
    public void perimeter();
}
class circle implements shape 
{
    private int radius;
    circle(int radius)
    {
        this.radius=radius;
    }
   public  void area()
    {
        System.out.println(Math.PI*radius*radius);
    }
   public void perimeter()
    {
        System.out.println(2*Math.PI*radius);
        
    }
}
class rectangle implements shape 
{
    private int length;
    private int breadth;
    rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
   public void area()
    {
        System.out.println(length*breadth);
    }
    public void perimeter()
    {
        System.out.println(2*(length+breadth));
    }
}
class Main 
{
    public static void main(String args[])
    {
        shape c=new circle(1);
        c.area();
        c.perimeter();
        shape r=new rectangle(1,2);
        r.area();
        r.perimeter();
    }
}
