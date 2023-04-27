package regnos.chapter15;

import java.io.Serializable;

public class Dog implements Serializable {
    private static final long serialVersionUID = 4065554235391532839L;
    private String name;
    private int age;

    public Dog(String name, int age){
        this.age= age;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
