class shape {
    public void area() {
    }
}

class circle extends shape {
    private int radius;

    circle(int radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

class rectangle extends shape {
    private int length;
    private int breadth;

    rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

class square extends shape {
    private int length;

    square(int length) {
        this.length = length;
    }public void area() {
        System.out.println("Area of Square: " + (length * length));
    }
}
class Main {
    public static void main(String args[]) {
        circle c = new circle(5);
        rectangle r = new rectangle(4, 5);
        square s = new square(4);
        c.area();
        r.area();
        s.area();
    }
}
