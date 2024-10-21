package lambdaHw.enums;

public enum Days {
    MONDAY("Start of the work week"),
    TUESDAY("Second day"),
    WEDNESDAY("Midweek"),
    THURSDAY("Almost there"),
    FRIDAY("End of the work week"),
    SATURDAY("Weekend begins"),
    SUNDAY("Rest day");

    private String description;

    Days(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    static {
        System.out.println("Days of the week initialized!");
    }
}