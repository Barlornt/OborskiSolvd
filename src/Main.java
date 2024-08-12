import javax.management.monitor.Monitor;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Zbigniew", "Marciniak", 25, "15-630", "ZbigniewMarciniak@gmail.com");
        Keyboard keyboard = new Keyboard("MAD DOG", "mechanical", 159.99);
        Display display = new Display("ASUS", "VA24DCP", "FHD", false, false, 399.00);
        Mouse mouse = new Mouse("M705", false, 1000, 169.00);
        Computer computer = new Computer("AMD Ryzen 5 4500", "MSI GeForce RTX 3050", "GIGABYTE Z790 UD AX", "ENDORFY Ventum", 3500.00, keyboard, display, mouse);

        System.out.println("Total price is: " + computer.totalPrice(computer.getPrice(), display.getPrice(), keyboard.getPrice(), mouse.getPrice()) + "zł.");
    }
}