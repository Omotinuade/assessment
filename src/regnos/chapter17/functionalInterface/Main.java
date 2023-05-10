package regnos.chapter17.functionalInterface;

public class Main {
    public static void main(String[] args) {
        Toyota toy = new Toyota();

        Moveable move = name -> "Toy moving like " + name;

        System.out.println(toy.mov(move));
    }
}
