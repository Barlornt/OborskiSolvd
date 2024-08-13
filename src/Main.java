// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Zbigniew", "Marciniak", 25, "15-630", "ZbigniewMarciniak@gmail.com");
        Keyboard keyboard = new Keyboard("MAD DOG", "ABClol", 159.99, true, "mechanical");
        PCMonitor pcMonitor = new PCMonitor("ASUS", "VA24DCP", 399.00, true, "FHD", false);
        Mouse mouse = new Mouse("Logitech","M705", 259.00,false,  1000);
        Product computer = new Computer("x-Kom","XYZ123", 5500.00, true, "Intel Core i5-12400F", "MSI GeForce RTX 3050", 32, keyboard, pcMonitor, mouse);


    }
}