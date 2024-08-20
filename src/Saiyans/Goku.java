package Saiyans;

final public class Goku extends Saiyan {
    final String WIFE = "ChiChi";
    public Goku(String name, int powerLevel) {
        super(name, powerLevel);
    }
    final public void transformToSSJ() {
        powerLevel *= 50;
        System.out.println("Goku has transformed into a Super Saiyan! Now his power level is " + powerLevel);
    }
}
