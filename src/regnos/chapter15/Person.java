package regnos.chapter15;

public class Person implements Human{
    private  String name;
    private Person(){}

    public static Human get(){
        var p = new Person();
        p.name="Tinu";
        return p;
    }
    @Override
    public void walk() {
        System.out.println("Walking like a Person");
    }
    public void run(){
        System.out.println("Running like a Person");
    }
}
