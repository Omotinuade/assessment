package regnos.chapter17.functionalInterface;

@FunctionalInterface
public interface Moveable {
    String move(String name);

    default void stop(){
        System.out.println("Stop");
    }
}
