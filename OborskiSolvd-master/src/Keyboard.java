import java.util.Objects;

public class Keyboard extends Product {
    private String type;


    public Keyboard(String producer, String model, double price, boolean isNew, String type) {
        super(producer, model, price, isNew);
        this.type = type;
    }

    @Override
    public double calculateDiscountedPrice(double discountPercentage) {
        double discount = getPrice() * (discountPercentage / 100);
        return getPrice() - discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Keyboard keyboard)) return false;
        return Objects.equals(type, keyboard.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "type='" + type + '\'' +
                '}';
    }
}
