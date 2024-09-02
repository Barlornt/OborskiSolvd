package com.solvd.computer;

public interface Virusable {
    void virused();
    default void notVirused(){
        System.out.println("I'm healthy, I don't have a virus :)");
    }
}