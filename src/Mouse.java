public class Mouse {
    private String model;
    private boolean wireless;
    private int sensitivity;
    private double price;

    public Mouse(String model, boolean wireless, int sensitivity, double price) {
        this.model = model;
        this.wireless = wireless;
        this.sensitivity = sensitivity;
        this.price = price;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public int getSensitivity() {
        return sensitivity;
    }

    public void setSensitivity(int sensitivity) {
        this.sensitivity = sensitivity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
