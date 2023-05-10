package regnos.chapter17.anonymousClass;

public class Main {
    public static void main(String[] args) {
        Toyota highlander = new Toyota();

        CarMethod car = new CarMethod() {
            @Override
            public void move() {
                System.out.println("Move");
            }

            @Override
            public void stop() {
                System.out.println("Stop");
            }
        };
        highlander.move(car);
        car.move();
    }
}
