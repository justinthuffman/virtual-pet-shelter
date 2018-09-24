package virtualPetShelter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldGetName() {
		// arrange
		VirtualPet underTest = new VirtualPet("Name", 0, 0, 0);
		// act
		String actual = underTest.getName();
		// assert
		assertEquals("Name", actual);
	}

	@Test
	public void shouldGetDescription() {
		// arrange
		VirtualPet underTest = new VirtualPet("Name", "Description");
		// act
		String actual = underTest.getDescription();
		// assert
		assertEquals("Description", actual);
	}

	@Test
	public void shouldGetHunger() {
		// arrange
		VirtualPet underTest = new VirtualPet("Name", 5, 0, 0);
		// act
		int actual = underTest.getHunger();
		// assert
		assertEquals(5, actual);
	}

	@Test
	public void shouldGetThirst() {
		// arrange
		VirtualPet underTest = new VirtualPet("Name", 0, 5, 0);
		// act
		int actual = underTest.getThirst();
		// assert
		assertEquals(5, actual);
	}

	@Test
	public void shouldGetBoredom() {
		// arrange
		VirtualPet underTest = new VirtualPet("Name", 0, 0, 5);
		// act
		int actual = underTest.getBoredom();
		// assert
		assertEquals(5, actual);
	}

	@Test
	public void shouldFeed() {
		// arrange
		VirtualPet underTest = new VirtualPet("Name", 7, 0, 0);
		// act
		underTest.feed();
		// assert
		assertEquals("Should be 0 having subtracted 7", 0, underTest.petHunger, .5);
	}

	@Test
	public void shouldWater() {
		// arrange
		VirtualPet underTest = new VirtualPet("Name", 0, 7, 0);
		// act
		underTest.water();
		// assert
		assertEquals("Should be 0 having subtracted 7", 0, underTest.petThirst, .5);
	}

	@Test
	public void shouldPlay() {
		// arrange
		VirtualPet underTest = new VirtualPet("Name", 0, 0, 7);
		// act
		underTest.play();
		// assert
		assertEquals("Should be 0 having subtracted 7", 0, underTest.petBoredom, .5);
	}

	@Test
	public void shouldTickHunger() {
		// arrange
		VirtualPet underTest = new VirtualPet("Name", 0, 0, 0);
		// act
		underTest.tick();
		// assert
		assertEquals("Should be 2 having added 2", 2, underTest.petHunger, .5);
	}

	@Test
	public void shouldTickThirst() {
		// arrange
		VirtualPet underTest = new VirtualPet("Name", 0, 2, 0);
		// act
		underTest.tick();
		// assert
		assertEquals("Should be 4 having added 2", 4, underTest.petThirst, .5);
	}

	@Test
	public void shouldTickBoredom() {
		// arrange
		VirtualPet underTest = new VirtualPet("Name", 0, 0, 4);
		// act
		underTest.tick();
		// assert
		assertEquals("Should be 6 having added 2", 6, underTest.petBoredom, .5);
	}
}