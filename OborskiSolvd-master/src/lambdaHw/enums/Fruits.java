package lambdaHw.enums;

public enum Fruits {
    APPLE("Apple", "Red"),
    BANANA("Banana", "Yellow"),
    ORANGE("Orange", "Orange");

    private String displayName;
    private String color;

    Fruits(String displayName, String color) {
        this.displayName = displayName;
        this.color = color;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getColor() {
        return color;
    }

    static {
        System.out.println("Fruit Enum Initialized with Apple, Banana, Orange");
    }
}