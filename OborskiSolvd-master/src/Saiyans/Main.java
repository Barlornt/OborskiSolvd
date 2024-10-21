package Saiyans;

public class Main {
    public static void main(String[] args) {

        Saiyan vegeta = new Saiyan("Vegeta", 9000);
        Goku goku = new Goku("Goku", 8000);

        vegeta.displayPowerLevel();

        goku.displayPowerLevel();
        goku.transformToSSJ();
        Saiyan.printSaiyanCount();
    }
}