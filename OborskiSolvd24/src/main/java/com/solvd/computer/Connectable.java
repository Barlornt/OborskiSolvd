package com.solvd.computer;

public interface Connectable {
    void connect();

    default void disconnect() {
        System.out.println("I am disconnected from the computer.");
    }
}