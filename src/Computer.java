import java.util.Objects;

public class Computer extends Product{
    protected String cpu;
    protected String gpu;
    protected int ram;
    protected Keyboard keyboard;


    protected PCMonitor pcMonitor;
    protected Mouse mouse;

    public Computer(String producer, String model, double price, boolean isNew, String cpu, String gpu, int ram, Keyboard keyboard, PCMonitor pcMonitor, Mouse mouse){
        super(producer, model, price, isNew);
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.keyboard = keyboard;
        this.pcMonitor = pcMonitor;
    }
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public PCMonitor getPcMonitor() {
        return pcMonitor;
    }

    public void setPcMonitor(PCMonitor pcMonitor) {
        this.pcMonitor = pcMonitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public double calculateDiscountedPrice(double discountPercentage) {
        double discount = getPrice() * (discountPercentage / 100);
        return getPrice() - discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return ram == computer.ram && Objects.equals(cpu, computer.cpu) && Objects.equals(gpu, computer.gpu) && Objects.equals(keyboard, computer.keyboard) && Objects.equals(pcMonitor, computer.pcMonitor) && Objects.equals(mouse, computer.mouse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, gpu, ram, keyboard, pcMonitor, mouse);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", ram=" + ram +
                ", keyboard=" + keyboard +
                ", pcMonitor=" + pcMonitor +
                ", mouse=" + mouse +
                '}';
    }
}

