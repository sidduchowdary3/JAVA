class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }
}

class Employee extends Person {
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getsalary() {
        return salary;
    }

    public void setsalary(double salary) {
        this.salary = salary;
    }
}

class Main {
    public static void main(String args[]) {
        Employee e = new Employee("siddu", 67, 50000);
        System.out.println(e.getname());
        System.out.println(e.getage());
        System.out.println(e.getsalary());
    }
}
