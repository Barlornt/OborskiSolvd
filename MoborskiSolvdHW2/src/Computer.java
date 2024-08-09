import javax.management.monitor.Monitor;

public class Computer {
    private String cpu;
    private String gpu;
    private String motherboard;
    private String caseModel;
    private double price;

    public double totalPrice(double pcPrice, double monitorPrice, double keyboardPrice, double mousePrice){
        return Math.floor((pcPrice + monitorPrice + keyboardPrice + mousePrice)*100)/100;
    }

    public Computer(String cpu, String gpu, String motherboard, String caseModel, double price) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.motherboard = motherboard;
        this.caseModel = caseModel;
        this.price = price;
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

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getCaseModel() {
        return caseModel;
    }

    public void setCaseModel(String caseModel) {
        this.caseModel = caseModel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

