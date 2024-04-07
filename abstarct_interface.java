interface car {
    public void brand();
    public void exhaust();
}

abstract class scar implements car {
    public abstract void price(); 
}

class benz extends scar {
    public void brand() {
        System.out.println("Mercedes");
    }
    public void exhaust() {
        System.out.println("Powerful");
    }
    public void price() {
        System.out.println("Not affordable");
    }
}

class audi implements car {
    public void brand() {
        System.out.println("German");
    }
    public void exhaust() {
        System.out.println("Very powerful");
    }
}

class Main {
    public static void main(String args[]) {
        scar b = new benz();
        b.brand();
        b.exhaust();
        b.price(); 

        car a = new audi(); 
        a.brand();
        a.exhaust();
    }
}
