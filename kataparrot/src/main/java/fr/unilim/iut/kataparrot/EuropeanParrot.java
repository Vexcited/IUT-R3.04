package fr.unilim.iut.kataparrot;

public class EuropeanParrot extends Parrot {
    public EuropeanParrot(boolean isNailed) {
        super(isNailed);
    }

    public double getSpeed() {
        return BASE_SPEED;
    }
}
