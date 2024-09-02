package com.solvd.Saiyans;

public class Saiyan {
    protected int powerLevel;
    private String name;
    static int saiyanCount;

    static {
        saiyanCount = 0;
        System.out.println("Initial Saiyan count: " + saiyanCount);
    }

    public Saiyan(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
        saiyanCount++;
    }


    public void displayPowerLevel() {
        System.out.println(name + "'s power level is: " + powerLevel);
    }

    public static void printSaiyanCount() {
        System.out.println("Total number of Saiyans: " + saiyanCount);
    }
    }