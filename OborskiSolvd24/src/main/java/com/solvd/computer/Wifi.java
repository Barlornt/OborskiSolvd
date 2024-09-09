package com.solvd.computer;

public interface Wifi {
    void wifiOn();
    default void wifiOff(){
        System.out.println("I'm not connected to the WiFi");
    }
}