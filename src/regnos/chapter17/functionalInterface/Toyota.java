package regnos.chapter17.functionalInterface;

import regnos.chapter17.anonymousClass.CarMethod;

public class Toyota{
    public String mov(Moveable able){
        return able.move("S green");
    }
    void stop(){
        System.out.println("Stop now");
    }
}
