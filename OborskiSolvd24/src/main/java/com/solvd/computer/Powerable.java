package com.solvd.computer;

public interface Powerable {

    void powerOn();
    default void powerOff(){
        System.out.println("I'm not connected to the power source");
    }
}
