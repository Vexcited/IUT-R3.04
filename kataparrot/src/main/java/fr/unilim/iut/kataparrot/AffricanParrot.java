package fr.unilim.iut.kataparrot;

public class AffricanParrot extends Parrot {
    private final int numberOfCoconuts;

    public AffricanParrot (int numberOfCoconuts, boolean isNailed) {
        super(isNailed);
        this.numberOfCoconuts = numberOfCoconuts;
    }

    public double getSpeed() {
        return Math.max(0, BASE_SPEED - LOAD_FACTOR * numberOfCoconuts);
    }
}
