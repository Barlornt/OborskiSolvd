import java.util.Objects;

public class PCMonitor extends Product {
        private String resolution;
        private boolean isCurved;

    public PCMonitor(String producer, String model, double price, boolean isNew, String resolution, boolean isCurved) {
        super(producer, model, price, isNew);
        this.resolution = resolution;
        this.isCurved = isCurved;
    }

    @Override
    public double calculateDiscountedPrice(double discountPercentage) {
        double discount = getPrice() * (discountPercentage / 100);
        return getPrice() - discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PCMonitor pcMonitor)) return false;
        return isCurved == pcMonitor.isCurved && Objects.equals(resolution, pcMonitor.resolution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolution, isCurved);
    }

    @Override
    public String toString() {
        return "PCMonitor{" +
                "resolution='" + resolution + '\'' +
                ", isCurved=" + isCurved +
                '}';
    }
}

