package fr.unilim.iut.kataparrot;

public abstract class Parrot {
	protected static final double LOAD_FACTOR = 9.0;
	protected static final double BASE_SPEED = 12.0;

	protected boolean isNailed;

	protected Parrot(boolean isNailed) {
		this.isNailed = isNailed;
	}
}
