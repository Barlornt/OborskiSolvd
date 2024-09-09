package com.solvd.computer;

public interface Hackable {
    void hacked();
    default void notHacked(){
        System.out.println("I'm under control of my owner :)");
    }
}
