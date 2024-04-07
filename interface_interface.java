interface car {
    public void brand();
}
interface scar {
    public void exhaust();
}
interface tcar extends car, scar {
    public void price();
}
class benz implements tcar {
    public void brand() {
        System.out.println("benz");
    }
    public void exhaust() {
        System.out.println("very powerful");
    }
    public void price() {
        System.out.println("very high");
    }
}
class alto implements tcar {
    public void brand() {
        System.out.println("maruti");
    }
    public void exhaust() {
        System.out.println("less powerful");
    }
    public void price() {
        System.out.println("very cheap");
    }
}
class Main {
    public static void main(String args[]) {
        tcar b = new benz();
        b.brand();
        b.exhaust();
        b.price();
        
        tcar a = new alto();
        a.brand();
        a.exhaust();
        a.price();
    }
}
