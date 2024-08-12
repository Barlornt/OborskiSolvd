public class Display {
    private String producer;
    private String model;
    private String resolution;
    private boolean isCurved;
    private boolean hasSpeakers;
    private double price;

    public Display(String producer, String model, String resolution, boolean isCurved, boolean hasSpeakers, double price) {
        this.model = model;
        this.resolution = resolution;
        this.isCurved = isCurved;
        this.hasSpeakers = hasSpeakers;
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public boolean isCurved() {
        return isCurved;
    }

    public void setCurved(boolean curved) {
        isCurved = curved;
    }

    public boolean isHasSpeakers() {
        return hasSpeakers;
    }

    public void setHasSpeakers(boolean hasSpeakers) {
        this.hasSpeakers = hasSpeakers;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
