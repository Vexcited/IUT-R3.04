package fr.unilim.iut.kataparrot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ParrotTest {

	@Test
	void getSpeedOfEuropeanParrot() {
		EuropeanParrot parrot = new EuropeanParrot(false);
		assertEquals(12.0, parrot.getSpeed(), 0.0);
	}

	@Test
	void getSpeedOfAfricanParrot_With_One_Coconut() {
		AffricanParrot parrot = new AffricanParrot(1, false);
		assertEquals(3.0, parrot.getSpeed(), 0.0);
	}

	@Test
	void getSpeedOfAfricanParrot_With_Two_Coconuts() {
		AffricanParrot parrot = new AffricanParrot(2, false);
		assertEquals(0.0, parrot.getSpeed(), 0.0);
	}

	@Test
	void getSpeedOfAfricanParrot_With_No_Coconuts() {
		AffricanParrot parrot = new AffricanParrot(0, false);
		assertEquals(12.0, parrot.getSpeed(), 0.0);
	}

	@Test
	void getSpeedNorwegianBlueParrot_nailed() {
		NorwegianBlueParrot parrot = new NorwegianBlueParrot(0, true);
		assertEquals(0.0, parrot.getSpeed(), 0.0);
	}

	@Test
	void getSpeedNorwegianBlueParrot_not_nailed() {
		NorwegianBlueParrot parrot = new NorwegianBlueParrot(1.5, false);
		assertEquals(18.0, parrot.getSpeed(), 0.0);
	}

	@Test
	void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
		NorwegianBlueParrot parrot = new NorwegianBlueParrot(4, false);
		assertEquals(24.0, parrot.getSpeed(), 0.0);
	}
}
