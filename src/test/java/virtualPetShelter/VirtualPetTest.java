package virtualPetShelter;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldPassFromInitialToHunger() {
		// arrange
		VirtualPet underTest = new VirtualPet(5, 0, 0, 0, 0);
		// act
		int hunger = underTest.hunger;
		// assert
		Assert.assertEquals(5, hunger, 0);
	}

	@Test
	public void shouldPassFromInitialToThirst() {
		// arrange
		VirtualPet underTest = new VirtualPet(0, 5, 0, 0, 0);
		// act
		int thirst = underTest.thirst;
		// assert
		Assert.assertEquals(5, thirst, 0);
	}

	@Test
	public void shouldPassFromInitialToWaste() {
		// arrange
		VirtualPet underTest = new VirtualPet(0, 0, 5, 0, 0);
		// act
		int waste = underTest.waste;
		// assert
		Assert.assertEquals(5, waste, 0);
	}

	@Test
	public void shouldPassFromInitialToBoredom() {
		// arrange
		VirtualPet underTest = new VirtualPet(0, 0, 0, 5, 0);
		// act
		int boredom = underTest.boredom;
		// assert
		Assert.assertEquals(5, boredom, 0);
	}

	@Test
	public void shouldPassFromInitialToTirdness() {
		// arrange
		VirtualPet underTest = new VirtualPet(0, 0, 0, 0, 5);
		// act
		int tiredness = underTest.tiredness;
		// assert
		Assert.assertEquals(5, tiredness, 0);
	}

	// Math tests

	@Test
	public void shouldSubtractFromHunger() {
		// arrange
		VirtualPet underTest = new VirtualPet(7, 0, 0, 0, 0);
		// act
		underTest.eat();
		// assert
		Assert.assertEquals(0, underTest.hunger, 0);
	}

	@Test
	public void shouldSubtractFromThirst() {
		// arrange
		VirtualPet underTest = new VirtualPet(0, 7, 0, 0, 0);
		// act
		underTest.drink();
		// assert
		Assert.assertEquals(0, underTest.thirst, 0);
	}

	@Test
	public void shouldSubtractFromWaste() {
		// arrange
		VirtualPet underTest = new VirtualPet(0, 0, 7, 0, 0);
		// act
		underTest.bathroom();
		// assert
		Assert.assertEquals(0, underTest.waste, 0);
	}

	@Test
	public void shouldSubtractFromBoredom() {
		// arrange
		VirtualPet underTest = new VirtualPet(0, 0, 0, 7, 0);
		// act
		underTest.play();
		// assert
		Assert.assertEquals(0, underTest.boredom, 0);
	}

	@Test
	public void shouldSubtractFromTiredness() {
		// arrange
		VirtualPet underTest = new VirtualPet(0, 0, 0, 0, 7);
		// act
		underTest.sleep();
		// assert
		Assert.assertEquals(0, underTest.tiredness, 0);
	}

	@Test
	public void shouldTestIfAlive() {
		// arrange
		VirtualPet underTest = new VirtualPet(0, 0, 0, 0, 0);
		// act
		boolean notDead = underTest.notDead();
		// assert
		Assert.assertTrue(notDead);
	}

}