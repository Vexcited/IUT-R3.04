package fr.unilim.iut.kataparrot;

public class NorwegianBlueParrot extends Parrot {
    private final double voltage;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        super(isNailed);
        this.voltage = voltage;
    }

    public double getSpeed() {
        return (isNailed) ? 0 : Math.min(24.0, voltage * BASE_SPEED);
    }
}
