package lambdaHw.enums;

public enum Car {
    TESLA(250, true),
    BMW(220, false),
    AUDI(240, false);

    private int maxSpeed;
    private boolean isElectric;

    Car(int maxSpeed, boolean isElectric) {
        this.maxSpeed = maxSpeed;
        this.isElectric = isElectric;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isElectric() {
        return isElectric;
    }

    static {
        System.out.println("Car Enum Initialized with Tesla, BMW, Audi");
    }
}